package com.genlot.demo.gateway.filter;

import cn.hutool.json.JSONUtil;
import com.genlot.demo.common.model.Response;
import com.genlot.demo.common.model.ResultCode;
import com.genlot.demo.gateway.config.GatewayConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

/**
 * <p> 认证过滤器 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/28 18:54
 */
@Slf4j
@Component
public class AuthFilter implements GlobalFilter, Ordered {

    private static final String AUTHORIZATION_HEADER_KEY = "Authorization";

    private static final String TOKEN = "999999999";

    @Autowired
    private GatewayConfig gatewayConfig;


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("auth filter");
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();
        String reqUrl = request.getURI().getPath();
        if (isIgnoreUrl(reqUrl)) {
            return chain.filter(exchange);
        }
        String token = request.getHeaders().getFirst(AUTHORIZATION_HEADER_KEY);
        if (Objects.isNull(token)){
            return getRepMono(response, ResultCode.AUTHORIZATION_HEADER_IS_NULL);
        } else if (!TOKEN.equals(token)) {
            return getRepMono(response, ResultCode.AUTHORIZATION_FAILED);
        }
        return chain.filter(exchange);
    }

    private boolean isIgnoreUrl(String url) {
        List<String> list = gatewayConfig.getExcludeUrls();
        if (list == null || list.isEmpty()) {
            return false;
        }
        try {
            AntPathMatcher pathMatcher = new AntPathMatcher();
            for (String tmp : list) {
                if (pathMatcher.match(tmp, url)) {
                    log.info("url:{} is allowed access without auth!", url);
                    return true;
                }
            }
        } catch (Exception e) {
            log.error("Check the url is exception.", e);
        }
        return false;
    }

    private Mono<Void> getRepMono(ServerHttpResponse response, ResultCode resultCode) {
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON_UTF8);
        log.info("response:{}", JSONUtil.toJsonStr(new Response<>(resultCode)));
        byte[] bytes = JSONUtil.toJsonStr(new Response<>(resultCode)).getBytes(StandardCharsets.UTF_8);
        DataBuffer buffer = response.bufferFactory().wrap(bytes);
        return response.writeWith(Mono.just(buffer));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

package com.genlot.demo.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p> 网关配置类 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/3/1 13:59
 */
@Data
@ConfigurationProperties(prefix = "gateway")
@Component
@RefreshScope
public class GatewayConfig {

    private List<String> excludeUrls;
}

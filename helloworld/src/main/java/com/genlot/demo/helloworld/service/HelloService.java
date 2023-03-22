package com.genlot.demo.helloworld.service;

import com.genlot.demo.helloworld.dao.AccessLogMapper;
import com.genlot.demo.helloworld.domain.entity.AccessLog;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p> HelloWorld服务 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/10 10:16
 */
@Service
@RefreshScope
public class HelloService implements IHelloService {

    @Resource
    private AccessLogMapper accessLogMapper;

    @Value("${config.test}")
    private String test;

    @Override
    public String sayHello() {
        return "hello world!" + test;
    }

    @Override
    public void recordAccessLog(String sourceIp) {
        AccessLog accessLog = new AccessLog();
        accessLog.setAccessTime(new Date());
        accessLog.setSourceIp(sourceIp);
        accessLogMapper.insert(accessLog);
    }
}

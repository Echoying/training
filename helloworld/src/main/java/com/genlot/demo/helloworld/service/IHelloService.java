package com.genlot.demo.helloworld.service;

/**
 * <p> add description here </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/10 10:33
 */
public interface IHelloService {
    String sayHello();

    void recordAccessLog(String sourceIp);
}

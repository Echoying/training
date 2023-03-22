package com.genlot.demo.helloworld;


import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableDiscoveryClient
@EnableKnife4j
@ComponentScan("com.genlot")
@EnableFeignClients(basePackages = {"com.genlot"})
public class HelloworldApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloworldApplication.class, args);
    }

}

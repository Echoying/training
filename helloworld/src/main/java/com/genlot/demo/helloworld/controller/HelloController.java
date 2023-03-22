package com.genlot.demo.helloworld.controller;

import com.genlot.demo.common.model.Response;
import com.genlot.demo.helloworld.service.IHelloService;
import com.genlot.demo.lottery.domain.dto.BetOrderDTO;
import com.genlot.demo.lottery.facade.BetOrderApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p> HelloWorld控制器 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/9 22:54
 */
@Slf4j
@RestController
@Api(tags = "HelloWorld")
@RequestMapping("/helloworld")
public class HelloController {

    @Resource
    private IHelloService helloService;

    @Resource
    private BetOrderApi betOrderApi;


    @ApiOperation(value = "hello")
    @GetMapping("/hello")
    public String hello() {
        log.info("hello");
        return "Hello World";
    }

    @ApiOperation(value = "hello1")
    @GetMapping("/hello1")
    public String hello1() {
        BetOrderDTO betOrderDTO = new BetOrderDTO();
        betOrderDTO.setAmount(2);
        betOrderDTO.setBetNum("3|7|3");
        Response response = betOrderApi.bet(betOrderDTO);
        log.info("response:" + response.getCode());
        helloService.recordAccessLog("127.0.0.1");
        return helloService.sayHello();
    }


    @ApiOperation(value = "echoyingTest1")
    @GetMapping("/echoyingTest1")
    public String echoyingTest1(){

        Response response = betOrderApi.echoyingTest1();

        return response.getMsg();
    }
}

package com.genlot.demo.lottery.controller;

import com.genlot.demo.common.model.Response;
import com.genlot.demo.lottery.domain.dto.BetOrderDTO;
import com.genlot.demo.lottery.facade.BetOrderApi;
import com.genlot.demo.lottery.service.IOrderService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p> Bet控制器 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/9 22:54
 */
@Slf4j
@RestController
@Api(tags = "投注订单")
public class BetController implements BetOrderApi {

    @Resource
    private IOrderService orderService;

    @Override
    public Response bet(@RequestBody BetOrderDTO orderDTO) {
        orderService.bet(orderDTO);
        return Response.SUCCESS;
    }

    @Override
    public Response echoyingTest1(){
            orderService.echoyingTest1();
        return Response.SUCCESS;
    }
}

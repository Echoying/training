package com.genlot.demo.lottery.facade;

import com.genlot.demo.common.model.Response;
import com.genlot.demo.lottery.domain.dto.BetOrderDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p> 投注订单接口 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/21 16:25
 */
@Api(tags = "投注订单")
@FeignClient(name = "lottery", path = "/")
public interface BetOrderApi {

    String BASE_URL = "/lottery/order";

    @ApiOperation(value = "投注")
    @PostMapping(BASE_URL + "/bet")
    public Response bet(@ApiParam(name = "orderDTO", value = "投注请求报文体", required = true)
            @RequestBody BetOrderDTO orderDTO);

    @ApiOperation(value = "测试1")
    @PostMapping(BASE_URL + "/echoyingTest1")
    public Response echoyingTest1( );
}

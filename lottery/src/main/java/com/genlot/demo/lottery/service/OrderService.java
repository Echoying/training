package com.genlot.demo.lottery.service;

import com.genlot.demo.lottery.dao.BetOrderMapper;
import com.genlot.demo.lottery.domain.dto.BetOrderDTO;
import com.genlot.demo.lottery.domain.entity.BetOrder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p> Order服务 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/10 10:16
 */
@Service
@RefreshScope
public class OrderService implements IOrderService {

    @Resource
    private BetOrderMapper betOrderMapper;

    @Override
    public void bet(BetOrderDTO betOrderDTO) {
        BetOrder betOrder = new BetOrder();
        betOrder.setBetTime(new Date());
        betOrder.setBetNum(betOrderDTO.getBetNum());
        betOrder.setAmount(betOrderDTO.getAmount());
        betOrderMapper.insert(betOrder);
    }

    @Override
    public String echoyingTest1(){

        return "lottery Succed!";
    }
}

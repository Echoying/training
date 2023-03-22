package com.genlot.demo.lottery.service;

import com.genlot.demo.lottery.domain.dto.BetOrderDTO;
import com.genlot.demo.lottery.domain.entity.BetOrder;

/**
 * <p> add description here </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/10 10:33
 */
public interface IOrderService {

    void bet(BetOrderDTO betOrder);

    String  echoyingTest1();
}

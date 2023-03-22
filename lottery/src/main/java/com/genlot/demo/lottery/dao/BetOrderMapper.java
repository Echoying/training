package com.genlot.demo.lottery.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.genlot.demo.lottery.domain.entity.BetOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p> 访问日志DAO类 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/10 13:56
 */
@Mapper
public interface BetOrderMapper extends BaseMapper<BetOrder> {
}

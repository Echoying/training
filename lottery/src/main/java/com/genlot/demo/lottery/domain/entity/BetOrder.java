package com.genlot.demo.lottery.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p> 访问日志实体类 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/10 14:51
 */
@Data
@TableName("bet_order")
public class BetOrder implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Date betTime;

    private String betNum;

    private Integer amount;
}

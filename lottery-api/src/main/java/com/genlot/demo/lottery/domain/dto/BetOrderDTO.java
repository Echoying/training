package com.genlot.demo.lottery.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "BetOrderDTO", description = "投注订单报文体")
@Data
public class BetOrderDTO implements Serializable {

    @ApiModelProperty(value = "订单ID", required = false, example = "xxx")
    private Long id;

    @ApiModelProperty(value = "投注时间", required = true)
    private Date betTime;

    @ApiModelProperty(value = "投注号码", required = true)
    private String betNum;

    @ApiModelProperty(value = "投注金额", required = true)
    private Integer amount;
}

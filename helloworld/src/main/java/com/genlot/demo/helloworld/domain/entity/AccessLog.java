package com.genlot.demo.helloworld.domain.entity;

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
@TableName("access_log")
public class AccessLog implements Serializable {

    private Long id;

    private Date accessTime;

    private String sourceIp;
}

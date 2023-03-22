package com.genlot.demo.helloworld.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.genlot.demo.helloworld.domain.entity.AccessLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p> 访问日志DAO类 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/10 13:56
 */
@Mapper
public interface AccessLogMapper extends BaseMapper<AccessLog> {
}

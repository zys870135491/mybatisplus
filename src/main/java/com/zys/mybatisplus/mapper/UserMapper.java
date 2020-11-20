package com.zys.mybatisplus.mapper;

import com.zys.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zwq
 * @since 2020-11-20
 */
public interface UserMapper extends BaseMapper<User> {

     User getUserOne(Long id);

}

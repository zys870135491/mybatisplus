package com.zys.mybatisplus.service;

import com.zys.mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zwq
 * @since 2020-11-20
 */
public interface UserService extends IService<User> {

    User getUserOne(Long id);

}

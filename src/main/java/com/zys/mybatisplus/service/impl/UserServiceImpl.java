package com.zys.mybatisplus.service.impl;

import com.zys.mybatisplus.entity.User;
import com.zys.mybatisplus.mapper.UserMapper;
import com.zys.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zwq
 * @since 2020-11-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserOne(Long id) {
        return userMapper.getUserOne(id);
    }
}

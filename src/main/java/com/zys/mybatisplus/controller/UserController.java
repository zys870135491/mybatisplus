package com.zys.mybatisplus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zys.mybatisplus.entity.User;
import com.zys.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zwq
 * @since 2020-11-20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUserList")
    public  IPage<User> getUserList(@RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                                    @RequestParam(name="pageSize", defaultValue="10") Integer pageSize){
        Page<User> page = new Page<User>(pageNo, pageSize);
        IPage<User> pageList = userService.page(page);
        return pageList;
    }

    @GetMapping(value = "/getUserOne")
    public User getUserOne(@RequestParam(name="id") Long id){
        return userService.getUserOne(id);
    }


}

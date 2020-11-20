package com.zys.mybatisplus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zys.mybatisplus.entity.CmsColumnType;
import com.zys.mybatisplus.entity.User;
import com.zys.mybatisplus.service.CmsColumnTypeService;
import com.zys.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zys
 * @since 2020-11-20
 */
@RestController
@RequestMapping("//cmsColumType")
public class CmsColumnTypeController {

    @Autowired
    private CmsColumnTypeService cmsColumnTypeService;

    @GetMapping(value = "/getUserList")
    public IPage<CmsColumnType> getUserList(@RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                                   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize){
        Page<CmsColumnType> page = new Page<CmsColumnType>(pageNo, pageSize);
        IPage<CmsColumnType> pageList = cmsColumnTypeService.page(page);
        return pageList;
    }

}

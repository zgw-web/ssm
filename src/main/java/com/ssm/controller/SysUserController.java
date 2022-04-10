package com.ssm.controller;


import com.ssm.pojo.SysUser;
import com.ssm.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Resource
    private SysUserService userService;

    @GetMapping("search")
    public List<SysUser> searchUser(){
        return new ModelAn
    }
}

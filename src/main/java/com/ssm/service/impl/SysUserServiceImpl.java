package com.ssm.service.impl;

import com.ssm.dao.SysUserMapper;
import com.ssm.pojo.SysUser;
import com.ssm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public List<SysUser> searchUserList() {
        return userMapper.selectAllUserList();
    }
}

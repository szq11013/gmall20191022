package com.zach.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zach.gmall.bean.UmsMember;
import com.zach.gmall.service.UserService;
import com.zach.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> findAllUser() {
        return userMapper.selectAll();
    }
}

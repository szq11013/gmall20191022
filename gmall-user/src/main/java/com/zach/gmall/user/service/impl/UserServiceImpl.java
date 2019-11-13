package com.zach.gmall.user.service.impl;

import com.zach.gmall.bean.UmsMember;
import com.zach.gmall.service.UserService;
import com.zach.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

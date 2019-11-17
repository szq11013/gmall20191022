package com.zach.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zach.gmall.bean.UmsMember;
import com.zach.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/index")
    @ResponseBody
    public List index() {
        List<UmsMember> userList = userService.findAllUser();
        return userList;
    }
}

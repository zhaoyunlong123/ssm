package com.javakc.ssm.user.controller;

import com.javakc.ssm.user.entity.User;
import com.javakc.ssm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户表现层实现类
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping("query")
    public String query(ModelMap model)
    {
        model.put("userList",userService.queryAll());
        return "user/list";
    }

    @RequestMapping("insert")
    public String insert(User entity)
    {
        userService.insert(entity);
        return "redirect:query.do";
    }
}

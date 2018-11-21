package com.nfsq.pagehelper.controller;

import com.github.pagehelper.PageInfo;
import com.nfsq.pagehelper.persist.dao.User;
import com.nfsq.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/selectAll")
    public Object selectAll(int page, int pageSize){
        return userService.selectAll(page,pageSize);
    }
}

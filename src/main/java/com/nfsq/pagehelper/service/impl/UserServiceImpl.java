package com.nfsq.pagehelper.service.impl;

import com.github.pagehelper.PageInfo;
import com.nfsq.pagehelper.persist.dao.User;
import com.nfsq.pagehelper.persist.mapper.UserMapper;
import com.nfsq.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Object selectAll(int page, int pageSize) {

        return  userMapper.selectAll();
    }
}

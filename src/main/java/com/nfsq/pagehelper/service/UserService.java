package com.nfsq.pagehelper.service;

import com.github.pagehelper.PageInfo;
import com.nfsq.pagehelper.persist.dao.User;

import java.util.List;

public interface UserService {
    Object selectAll(int page, int pageSize);
}

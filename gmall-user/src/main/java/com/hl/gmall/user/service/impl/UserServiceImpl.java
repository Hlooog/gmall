package com.hl.gmall.user.service.impl;

import com.hl.gmall.user.mapper.UserMapper;
import com.hl.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by Hl
 * 2020/5/8 23:20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

}

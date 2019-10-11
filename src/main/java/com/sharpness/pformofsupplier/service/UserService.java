package com.sharpness.pformofsupplier.service;

import com.sharpness.pformofsupplier.dao.UserDao;
import com.sharpness.pformofsupplier.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: supplier_platform
 * @description: 用户服务类
 * @author: Charles
 * @create: 2019-10-06 09:17
 **/
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id)
    {
        return   userDao.getById(id);
    }
}
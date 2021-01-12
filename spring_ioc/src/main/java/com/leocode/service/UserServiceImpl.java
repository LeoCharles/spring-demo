package com.leocode.service;

import com.leocode.dao.UserDao;

/**
 * 业务层实现类
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    // 动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        // 业务层调用 Dao 层
        userDao.getUser();
    }
}

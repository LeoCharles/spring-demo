package com.leocode.dao.impl;

import com.leocode.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl 创建");
    }

    public void init() {
        System.out.println("初始化方法...");
    }

    public void save() {
        System.out.println("save running...");
    }

    public void destroy() {
        System.out.println("销毁方法...");
    }
}

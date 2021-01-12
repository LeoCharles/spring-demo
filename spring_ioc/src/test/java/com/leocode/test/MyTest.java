package com.leocode.test;

import com.leocode.dao.UserDaoImpl;
import com.leocode.dao.UserDaoMysqlImpl;
import com.leocode.dao.UserDaoOracleImpl;
import com.leocode.service.UserService;
import com.leocode.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void testUser() {

        // 用户实际调用的是业务层
        UserService userService = new UserServiceImpl();

        // 让用户选择实现类
        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());       // 默认
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());  // 使用 Mysql
        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl()); // 使用 Oracle

        userService.getUser();
    }
}

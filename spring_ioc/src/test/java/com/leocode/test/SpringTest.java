package com.leocode.test;

import com.leocode.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    // 测试 scope 属性
    @Test
    public void testScope() {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao1 = (UserDao) app.getBean("userDao");
        UserDao userDao2 = (UserDao) app.getBean("userDao");

        System.out.println("userDao1:" + userDao1);
        System.out.println("userDao2:" + userDao2);

    }
}

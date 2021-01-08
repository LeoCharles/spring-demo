package com.leocode.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

    @Test
    public void test() {
        // 获取 IOC 容器，传入当前应用的 xml 配置文件
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object person01 = ioc.getBean("person01");

        System.out.println(person01);
    }
}

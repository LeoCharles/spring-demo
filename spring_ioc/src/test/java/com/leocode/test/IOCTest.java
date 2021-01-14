package com.leocode.test;

import com.leocode.bean.Person;
import com.leocode.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext 是 IOC 容器接口
 * 容器中对象的创建在容器创建的时候就已经创建，在容器中通过 id 拿到这个组件对象
 * IOC 容器在创建这个组件对象的时候，会利用 setter 方法为 javaBean 赋值
 * 同一个组件，在 IOC 容器中是单实例的
 *
 */

public class IOCTest {

    // 获取 IOC 容器，传入当前应用的 xml 配置文件
    private final ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    // 通过 IOC 容器创建对象
    @Test
    public void test01() {
        // 容器创建的时候，注入的组件也创建了，可以直接获取
        Person person01 = (Person) ioc.getBean("person01");
        System.out.println(person01);
    }

    // 根据 bean 的类型 从 IOC 容器中获取 bean 的实例
    @Test
    public void test02() {
         // 如果 IOC 容器中这个类型的 bean 有多个，查找就会报错
         // Person bean = ioc.getBean(Person.class);
         // System.out.println(bean);
        Person bean2 = ioc.getBean("person02", Person.class);
        System.out.println(bean2);
    }

    // 通过构造器为 bean 的属性赋值
    @Test
    public void test03() {
        Person person03 = (Person) ioc.getBean("person03");
        System.out.println(person03);
    }

    // 复杂数据赋值
    @Test
    public void test04() {
        Student student = (Student) ioc.getBean("student");
        System.out.println(student);
    }
}

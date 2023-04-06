package com.spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class TestUser {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6.bean对象创建完成");
        System.out.println(user);
        context.close();
    }

}

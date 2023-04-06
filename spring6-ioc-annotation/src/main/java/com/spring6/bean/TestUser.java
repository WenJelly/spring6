package com.spring6.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/30
 *@Author：Jelly
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context =
               new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }


}

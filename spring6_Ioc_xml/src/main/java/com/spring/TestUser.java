package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/24
 *@Author：Jelly
 */
public class TestUser {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        //1.根据id获取bean
        Object user1 = context.getBean("user");
        System.out.println("根据id获取bean" + user1);

        //2.根据类型来获取bean
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取bean" + user2);

        //3.根据id和类型获取bean
        User user3 = context.getBean("user", User.class);
        System.out.println("根据id和类型获取bean" + user3);

        //注意
        //当根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个

    }

}

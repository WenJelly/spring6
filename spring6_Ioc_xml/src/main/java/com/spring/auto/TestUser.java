package com.spring.auto;

import com.spring.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }

}

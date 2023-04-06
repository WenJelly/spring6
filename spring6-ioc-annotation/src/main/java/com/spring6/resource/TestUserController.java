package com.spring6.resource;

import com.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/30
 *@Author：Jelly
 */
public class TestUserController {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.add();

    }
}

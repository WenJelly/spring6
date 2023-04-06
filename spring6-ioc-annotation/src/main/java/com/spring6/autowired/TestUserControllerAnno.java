package com.spring6.autowired;

import com.spring6.SpringConfig;
import com.spring6.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 *@Time：2023/3/31
 *@Author：Jelly
 */
public class TestUserControllerAnno {

    public static void main(String[] args) {

        //加载配置类
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = context.getBean(UserController.class);
        bean.add();
    }
}

package com.spring6.resource;

import com.spring6.SpringConfig;
import com.spring6.autowired.controller.UserController;
import org.apache.logging.log4j.core.config.AppenderControl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

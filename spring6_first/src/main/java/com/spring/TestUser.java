package com.spring;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/23
 *@Author：Jelly
 */
public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {

        //加载spring配置文件,对象创建
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");


        //获取创建对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        //使用对象调用方法进行厕所
        user.add();

        //手动写入日志
        logger.info("执行调用成功了...");

    }

    @Test
    //反射创建对象
    public void testUserObject1() throws Exception {
        Class<?> aClass = Class.forName("com.spring.User");
        //过时了
        Object o = aClass.newInstance();
        //现在基本都用这个
        User user =(User) aClass.getDeclaredConstructor().newInstance();
    }

}

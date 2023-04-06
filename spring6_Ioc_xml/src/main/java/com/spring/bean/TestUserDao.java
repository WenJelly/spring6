package com.spring.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/24
 *@Author：Jelly
 */
public class TestUserDao {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //通过类型获取接口对应的bean
        UserDao bean = classPathXmlApplicationContext.getBean(UserDao.class);
        System.out.println(bean);
        bean.run();

    }

}

package com.spring6.sprini18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        Object[] objects = {"jelly", new Date().toString()};
        String message = context.getMessage("www.wenguodong.com", objects, Locale.CHINA);
        System.out.println(message);
    }
}

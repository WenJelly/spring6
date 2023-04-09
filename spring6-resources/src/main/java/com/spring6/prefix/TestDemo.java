package com.spring6.prefix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:bean*.xml");
        Resource resource = context.getResource("wenguodong.txt");
        System.out.println(resource.getDescription());

    }
}

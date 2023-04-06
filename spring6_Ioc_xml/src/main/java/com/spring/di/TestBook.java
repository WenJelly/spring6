package com.spring.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/24
 *@Author：Jelly
 */
public class TestBook {

    @Test
    public void testSet(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Object book = context.getBean("book");
        System.out.println(book);

    }

    @Test
    public void testConstructor(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di.xml");
        Object book = context.getBean("bookCon");
        System.out.println(book);

    }

}

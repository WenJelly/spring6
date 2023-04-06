package com.spring.dimap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("studentp", Student.class);
        System.out.println(student);

    }
}

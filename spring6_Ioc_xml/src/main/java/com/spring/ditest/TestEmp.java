package com.spring.ditest;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Time：2023/3/25
 *@Author：Jelly
 */
public class TestEmp {


    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp",Emp.class);
        emp.work();
    }


    @Test
    public void testEmp(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-array.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }

}

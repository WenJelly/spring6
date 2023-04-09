package com.spring6.validation.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
public class TestUser {
    @Test
    public void testValidationOne() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 validation1 = context.getBean(MyValidation1.class);
        User user = new User();
        user.setName("jelly");
        user.setAge(-1); //false
        boolean message = validation1.validatorByUserOne(user);
        System.out.println(message);
    }

    @Test
    public void testValidationTwo() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 validation2 = context.getBean(MyValidation2.class);
        User user = new User();
        user.setName("jelly");
        user.setAge(-1); //true  : ture表示有错误信息，false表示没有错误信息
        boolean message = validation2.validatorByUserTwo(user);
        System.out.println(message);
    }
}

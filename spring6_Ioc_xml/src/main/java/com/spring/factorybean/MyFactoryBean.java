package com.spring.factorybean;

import com.spring.User;
import org.springframework.beans.factory.FactoryBean;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}

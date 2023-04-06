package com.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/*
 *@Time：2023/4/2
 *@Author：Jelly
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringTestJunit {

    @Autowired
    private User user;

    @Test
    public void testUser() {
        System.out.println(user);
        user.run();
    }

}

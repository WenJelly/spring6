package com.spring.jadb;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class TestJDBC {

    @Test
    public void demo01(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/wgd_student?serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
    }

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DataSource dataSource = ac.getBean(DruidDataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}

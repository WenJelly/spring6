package com.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/*
 *@Time：2023/4/3
 *@Author：Jelly
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //添加，修改，删除
    //1.实现添加操作
    @Test
    public void testUpdate1() {
        //第一步 编写sql语句
        String sql = "insert into t_emp values(null,?,?,?)";
        //第二步 调用jdbcTemplate的方法，传入相关参数
        for (int i = 0; i < 100; i++) {
            int rows = jdbcTemplate.update(sql, "Jelly" + i, 18, "男");
            System.out.println(rows);
        }
    }

    //2.修改操作
    @Test
    public void testUpdate2() {
        //第一步 编写sql语句
        String sql = "update t_emp set name=? where id = ?";
        int rows = jdbcTemplate.update(sql, "Jelly666",1);
        System.out.println(rows);
    }
}

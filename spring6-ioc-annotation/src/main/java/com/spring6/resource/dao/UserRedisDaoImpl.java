package com.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/*
 *@Time：2023/3/31
 *@Author：Jelly
 */
@Repository
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao redis............");
    }
}

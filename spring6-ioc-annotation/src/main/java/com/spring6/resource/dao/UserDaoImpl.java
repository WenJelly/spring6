package com.spring6.resource.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/*
 *@Time：2023/3/30
 *@Author：Jelly
 */
@Repository("myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao.....");
    }
}

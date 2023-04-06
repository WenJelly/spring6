package com.spring6.autowired.dao;

import com.spring6.bean.User;
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

package com.spring6.resource.service;

import com.spring6.resource.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
 *@Time：2023/3/30
 *@Author：Jelly
 */
@Service("myUserService")
public class UserServiceImpl  implements UserService {

    @Resource(name = "myUserDao")
    private UserDao userDao;


    @Override
    public void add() {
        System.out.println("service");
        userDao.add();
    }
}

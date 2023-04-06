package com.spring.auto.service;

import com.spring.auto.dao.UserDao;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userService的方法实现了");
        //调用userDao里面的方法
        userDao.addUserDao();
    }
}

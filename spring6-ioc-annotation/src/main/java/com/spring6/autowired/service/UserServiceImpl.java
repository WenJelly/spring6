package com.spring6.autowired.service;

import com.spring6.autowired.dao.UserDao;
import com.spring6.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
 *@Time：2023/3/30
 *@Author：Jelly
 */
@Service
public class UserServiceImpl  implements UserService{

    //注入Dao
    //第一种方式:属性注入
//    @Autowired
//    private UserDao userDao;

    //第二种方式：set注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //第三种方式：构造方法注入
//    private UserDao userDao;
//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //第四种方式：形参上注入
//    private UserDao userDao;
//    public UserServiceImpl(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }

    //俩个注解，根据名称注入，可以用于一个接口有多个实现类
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service");
        userDao.add();
    }
}

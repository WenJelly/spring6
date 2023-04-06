package com.spring.auto.controller;

import com.spring.auto.service.UserService;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller方法执行了");
        //调用service的方法
        userService.addUserService();
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.addUserService();
    }

}

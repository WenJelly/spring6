package com.spring6.autowired.controller;

import com.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*
 *@Time：2023/3/30
 *@Author：Jelly
 */
@Controller(value = "myUserController")
public class UserController {

    //注入Service
    //第一种方式:属性注入

//    @Autowired
//    public UserService userService;

    //第二种方式:set注入
//    public UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    //第三种方式：构造方法进行注入
//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    //第四种方式：形参上注入
    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller");
        userService.add();
    }


}

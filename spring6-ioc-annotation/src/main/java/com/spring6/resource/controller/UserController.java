package com.spring6.resource.controller;

import com.spring6.resource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/*
 *@Time：2023/3/30
 *@Author：Jelly
 */
@Controller(value = "userController")
public class UserController {

    @Resource(name = "myUserService")
    private UserService userService;

    public void add() {
        System.out.println("controller");
        userService.add();
    }


}

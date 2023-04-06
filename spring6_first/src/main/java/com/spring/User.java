package com.spring;

/*
 *@Time：2023/3/23
 *@Author：Jelly
 */
public class User {

    private String name;
    private Person person;

    public void add(){

        System.out.println("add.....");

    }

    public User() {
        System.out.println("无参构造被执行了");
    }
}

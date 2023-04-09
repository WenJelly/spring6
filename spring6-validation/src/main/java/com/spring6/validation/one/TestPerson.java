package com.spring6.validation.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
public class TestPerson {
    public static void main(String[] args) {
        //创建Person对象
        Person person = new Person();
        person.setName("Jelly");
        person.setAge(-1);
        //创建person对应dataBinder
        DataBinder dataBinder = new DataBinder(person);
        //设置校验器
        dataBinder.setValidator(new PersonValidator());
        //调用方法执行校验
        dataBinder.validate();
        //输出校验结果
        BindingResult result = dataBinder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}

package com.spring.ditest;

import java.util.Arrays;

/*
 *@Time：2023/3/25
 *@Author：Jelly
 */
public class Emp {
    private String empName;
    private Integer age;

    //员工属于某个部分
    private Dept dept;

    //爱好
    private String[] loves;

    public Emp(String empName, Integer age, Dept dept, String[] loves) {
        this.empName = empName;
        this.age = age;
        this.dept = dept;
        this.loves = loves;
    }

    public void work() {
        System.out.println("work.....");
        dept.info();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                ", loves=" + Arrays.toString(loves) +
                '}';
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public Emp() {
    }
}


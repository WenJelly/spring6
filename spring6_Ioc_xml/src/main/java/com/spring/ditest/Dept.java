package com.spring.ditest;

import java.util.List;

/*
 *@Time：2023/3/25
 *@Author：Jelly
 */
public class Dept {

    //一个部门有很多员工
    private List<Emp> empList;

    private String deptName;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info(){
        System.out.println("emp....info...");
        for (Emp emp :empList) {
            System.out.println(emp.getEmpName());
        }

    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "empList=" + empList +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    public Dept() {
    }
}

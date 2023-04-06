package com.spring.dimap;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class Teacher {

    private String tId;
    private String tName;

    public Teacher(String tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    public void run(){
        System.out.println("tId = " + tId + "   tName = " + tName);
    }

    public Teacher() {
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId='" + tId + '\'' +
                ", tName='" + tName + '\'' +
                '}';
    }
}

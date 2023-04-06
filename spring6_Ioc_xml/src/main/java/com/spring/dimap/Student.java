package com.spring.dimap;

import java.util.List;
import java.util.Map;

/*
 *@Time：2023/3/27
 *@Author：Jelly
 */
public class Student {

    private List<Lesson> lessons;

    private Map<String,Teacher> teacherMap;

    private String sId;
    private String sName;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public Student() {
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherMap=" + teacherMap +
                ", sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }

    public void run(){
        System.out.println("sId = " + sId + "   sName = " + sName);
        System.out.println(teacherMap);
        System.out.println(lessons);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}

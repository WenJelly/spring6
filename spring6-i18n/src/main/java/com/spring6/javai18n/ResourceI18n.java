package com.spring6.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages",
                new Locale("zh", "CN"));
        String value1 = bundle.getString("test");
        System.out.println(value1);

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages",
                new Locale("en", "GB"));
        String value2 = bundle1.getString("test");
        System.out.println(value2);
    }
}

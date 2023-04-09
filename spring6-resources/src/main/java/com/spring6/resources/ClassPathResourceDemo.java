package com.spring6.resources;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
//访问类路径下的资源
public class ClassPathResourceDemo {

    public static void loadClasspathResource(String path) {
        //创建对象
        ClassPathResource classPathResource = new ClassPathResource(path);

        System.out.println(classPathResource.getPath());
        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());
        //获取文件内容
        try {
            InputStream inputStream = classPathResource.getInputStream();
            byte[] buf = new byte[1024];
            while((inputStream.read(buf)) != -1) {
                System.out.println(new String(buf));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        loadClasspathResource("wenguodong.txt");
    }
}

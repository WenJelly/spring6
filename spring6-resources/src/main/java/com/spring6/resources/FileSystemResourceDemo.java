package com.spring6.resources;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
//访问系统中的资源
public class FileSystemResourceDemo {
    public static void loadFileResource(String path) {
        //创建对象
        FileSystemResource fileSystemResource = new FileSystemResource(path);

        System.out.println(fileSystemResource.getFilename());
        System.out.println(fileSystemResource.getDescription());
        try {
            InputStream inputStream = fileSystemResource.getInputStream();
            byte[] buf = new byte[2048];
            while((inputStream.read(buf)) != -1) {
                System.out.println(new String(buf));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        loadFileResource("d:\\wenguodong.txt");
    }
}

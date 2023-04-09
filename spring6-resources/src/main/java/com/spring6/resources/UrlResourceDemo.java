package com.spring6.resources;

import org.springframework.core.io.UrlResource;

import javax.annotation.Resource;
import java.net.MalformedURLException;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
//演示UrlResource访问网络资源
public class UrlResourceDemo {
    //访问前缀是http、file
    public static void loadUrlResource(String path) {
        try {
            //创建Resource接口实现类的对象 UrlResource
            UrlResource url = new UrlResource(path);
            //获取资源信息
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        //http前缀
        //loadUrlResource("http://www.baidu.com");

        //file前缀:需要放在根路径下 ： 比如在Spring_T下
        loadUrlResource("file:wenguodong.txt");
    }
}

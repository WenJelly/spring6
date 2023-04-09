package com.spring6.di;


import org.springframework.core.io.Resource;

/*
 *@Time：2023/4/8
 *@Author：Jelly
 */
public class ResourceBean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse() {
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}

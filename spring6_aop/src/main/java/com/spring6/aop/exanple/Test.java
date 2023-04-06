package com.spring6.aop.exanple;

import com.spring6.aop.annoaop.Calculator;
import com.spring6.aop.annoaop.CalculatorImpl;

/*
 *@Time：2023/4/1
 *@Author：Jelly
 */
public class Test {

    public static void main(String[] args) {
        //创建代理对象（动态）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy =(Calculator)proxyFactory.getProxy();
        proxy.add(1,2);
    }

}

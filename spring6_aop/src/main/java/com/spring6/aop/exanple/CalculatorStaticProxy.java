package com.spring6.aop.exanple;

import com.spring6.aop.annoaop.Calculator;

/*
 *@Time：2023/4/1
 *@Author：Jelly
 */
public class CalculatorStaticProxy implements Calculator {

    //被代理目标对象传递过来
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {

        //输出日志
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);

        //调用目标对象的方法实现核心业务
        int add = calculator.add(i, j);

        System.out.println("[日志] add 方法结束了，结果是：" + add);
        return 0;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}

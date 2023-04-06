package com.spring6.aop.annoaop;

import com.spring6.aop.annoaop.Calculator;
import org.springframework.stereotype.Component;

/*
 *@Time：2023/4/1
 *@Author：Jelly
 */
//实现了最基本的加减乘除
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;

        System.out.println("方法内部 result = " + result);

        return result;
    }
}

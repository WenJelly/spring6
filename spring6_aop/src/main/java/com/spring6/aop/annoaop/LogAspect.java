package com.spring6.aop.annoaop;

/*
 *@Time：2023/4/2
 *@Author：Jelly
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//切面类
@Aspect  //表示切面类
@Component //ioc容器
public class LogAspect {

    /**
     * 设置切入点和通知类型
     * 通知类型：
     * 前置通知：@Before()
     * 返回通知：@AfterReturning
     * 异常通知：@AfterThrowing
     * 后置通知：@After()
     * 环绕通知：@Around()
     * 每种通知类型前面都要加上相对应的注解来表明是什么通知类型
     */

    //前置通知,有个value属性，value=切入点表达式配置切入点
    //切入点表达式：execution(访问修饰符 增强方法的返回类型 全类名.方法的名称(方法参数的类型))
    @Before(value = "execution(public int com.spring6.aop.annoaop.CalculatorImpl.add(int,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知,方法名字 = " + name + ",参数 = " + Arrays.toString(args));
    }

    //返回通知,在后置通知之前执行
    @AfterReturning(value = "execution(* com.spring6.aop.annoaop.CalculatorImpl.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {

        String name = joinPoint.getSignature().getName();//返回的方法名字
        Object[] args = joinPoint.getArgs();//返回方法的参数
        System.out.println("Logger-->返回通知,方法名字 = " + name + ", 参数 = " + Arrays.toString(args) + ",返回结果 = " + result);

    }

    //后置通知
    @After(value = "execution(* com.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->后置通知,方法名字 = " + name + ",参数 = " + Arrays.toString(args));
    }

    //异常通知：目标方法执行过程中出现了异常就会执行
    @AfterThrowing(value = "execution(* com.spring6.aop.annoaop.CalculatorImpl.*(..))",throwing = "EX")
    public void afterThrowingMethod(JoinPoint joinPoint , Throwable EX) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->异常通知,方法名字 = " + name + ",参数 = " + Arrays.toString(args) + ",异常通知 = " + EX);
    }

    //环绕通知，在之前和之后都会执行
    @Around(value = "execution(* com.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Object result = null;
        try{
            System.out.println("环绕通知==目标方法之前执行");
            //调用目标方法
            result = joinPoint.proceed();

            System.out.println("环绕通知==目标方法之后执行");
        }catch (Throwable throwable) {
            System.out.println("环绕通知==目标方法出现异常时执行");
        }finally {
            System.out.println("环绕通知==目标方法执行完毕");
        }
        return result;
    }


    //重用切入点表达式

    @Pointcut(value = "execution(* com.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointcut() {}
    //在同一个切面下
    //可以这样写：
    //比如后置
    //@After(value = "pointCut()")

    //如果不在同一个切面下的话，就要加上pointCut的全路径

}

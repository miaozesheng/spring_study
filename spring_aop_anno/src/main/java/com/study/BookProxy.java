package com.study;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * description 实现增强的类
 *
 * @author miaozesheng 2022/04/04 17:20
 */
@Component
@Aspect
@Order(2)
public class BookProxy {


    // 相同切入点抽取
    @Pointcut(value = "execution(* com.study.Book.add(..))")
    public void pointDemo(){

    }

    // 如果一个类里边的方法被多个代理进行增强

    // 前置通知 方法执行之前执行
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before....");
    }

    // 最终通知 方法返回值执行之后执行 不管有没有异常都会执行 有点类似于finally
    @After("execution(* com.study.Book.add(..))")
    public void after(){
        System.out.println("after....");
    }

    // 后置通知 方法执行之后执行 有异常就不会执行了
    @AfterReturning("execution(* com.study.Book.add(..))")
    public void fina(){
        System.out.println("finally....");
    }

    // 异常通知 方法中出现异常执行 比如这里的add()方法中出现除0异常,那么这个会执行
    @AfterThrowing("execution(* com.study.Book.add(..))")
    public void excep(){
        System.out.println("exception....");
    }
    // 环绕通知 增强方法执行之前和之后通知
    /*
            after...before...
            before....
            add.....
            finally....
            after....
            after---beofre----
     */
    @Around("execution(* com.study.Book.add(..))")
    public void afterBefore(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕前...");
        // 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕后---");
    }
}

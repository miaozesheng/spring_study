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



    public void before(){
        System.out.println("before....");
    }


    public void after(){
        System.out.println("after....");
    }


    public void fina(){
        System.out.println("finally....");
    }


    public void excep(){
        System.out.println("exception....");
    }

    public void afterBefore(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕前...");
        // 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕后---");
    }
}

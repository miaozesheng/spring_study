package com.study;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * description 测试多个代理对同一个方法进行增强时,设置增强类优先级
 * 在增强类上边添加注解@Order(数字类型值 ) 数字越小优先级越高
 *
 * @author miaozesheng 2022/04/04 18:12
 */
@Component
@Aspect
@Order(1)
public class BookProxy2 {

    // 最终通知 方法返回值执行之后执行 不管有没有异常都会执行 有点类似于finally
    @After("execution(* com.study.Book.add(..))")
    public void after(){
        System.out.println("afterw222222222....");
    }


    // 前置通知 方法执行之前执行
    @Before(value = "execution(* com.study.Book.add(..))")
    public void before(){
        System.out.println("before222222222....");
    }
}

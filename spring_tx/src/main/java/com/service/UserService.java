package com.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * description
 *
 * @author miaozesheng 2022/04/04 18:55
 */

@Service
@Transactional // 加到类上,那就是这个类里边的所有方法都加上事务 如果加在方法上边,那么只给这个方法加上注解
public class UserService {


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = 1000,readOnly = true)
    public void method1(){

    }

    @Transactional()
    public void method2(){

    }

}

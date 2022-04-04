package com.study;

import org.springframework.stereotype.Component;

/**
 * description 被增强类
 *
 * @author miaozesheng 2022/04/04 17:20
 */
@Component
public class Book {

    public void add(){
        //int a = 3/0;
        System.out.println("add.....");
    }
}

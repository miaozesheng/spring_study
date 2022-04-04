package com.study;

import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author miaozesheng 2022/04/04 17:31
 */
@Service
public class BookServiceImpl implements BookService{

    @Override
    public int add(int a, int b) {
        System.out.println("add.....");
        return a+b;
    }
}

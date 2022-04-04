package com.study;

import org.springframework.stereotype.Repository;

/**
 * description
 *
 * @author miaozesheng 2022/04/04 17:32
 */
@Repository
public class BookDAO {
    int add(int a , int b){
        System.out.println("DAO  add....");
        return a+b;
    }

}

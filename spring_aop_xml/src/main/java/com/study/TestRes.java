package com.study;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description
 *
 * @author miaozesheng 2022/04/04 17:48
 */
public class TestRes {

    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Book book = classPathXmlApplicationContext.getBean("book", Book.class);
        book.add();
    }
}

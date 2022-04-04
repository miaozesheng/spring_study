package com.study;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description
 *
 * @author miaozesheng 2022/04/04 17:48
 */
public class TestRes {
    @Test
    public void test(){
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Book book = classPathXmlApplicationContext.getBean("book", Book.class);
        // 使用纯注解进行测试 获取启动相关东西
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        Book book = configApplicationContext.getBean("book", Book.class);

        book.add();
    }
}

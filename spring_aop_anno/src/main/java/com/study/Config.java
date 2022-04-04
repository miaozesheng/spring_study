package com.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * description 用以开启注解的扫描
 *
 * @author miaozesheng 2022/04/04 17:23
 */
@Configuration
@ComponentScan(basePackages = {"com.study"})
@EnableAspectJAutoProxy(proxyTargetClass = true) // 开启AspectJ生成代理对象
public class Config {

    public void test() {
        // 获取spring配置文件的几种方式
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext();
        // 获取注解配置类
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
    }
}

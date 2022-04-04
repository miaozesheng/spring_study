package spring5;

import org.springframework.context.support.GenericApplicationContext;
import service.UserService;

/**
 * description
 *
 * @author miaozesheng 2022/04/04 23:15
 */
public class TestBeanToSpring {
    public static void main(String[] args) {

        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        genericApplicationContext.refresh();//清楚信息
        genericApplicationContext.registerBean(UserService.class,()->new UserService());// 将自己创建的bean交由spring管理


    }

}

package spring5.junit;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * description spring5新特性 部分测试功能的增强
 *
 * @author miaozesheng 2022/04/04 23:06
 */
@RunWith(SpringJUnit4ClassRunner.class) //单元测试框架
@ContextConfiguration("classpath:bean.xml") // 加载配置文件
public class JTest4 {
    @Autowired
    private UserService userService;

}

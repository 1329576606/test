package itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAN {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotation.xml");
        UserController userController= (UserController) applicationContext.getBean("userService");
        userController.save();

    }
}

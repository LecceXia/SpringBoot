package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Impl.UserServiceImpl;
import service.UserSerivce;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserSerivce userService = (UserSerivce) app.getBean("userService");
        userService.save();
    }
}

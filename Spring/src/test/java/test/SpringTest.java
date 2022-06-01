package test;

import beanpost.Category;
import constructer.Customer;
import converter.Person;
import dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import proxy.User;
import proxy.UserService;
import proxy.UserServiceProxy;

import java.sql.Connection;

public class SpringTest {
    @Test
    // test scope
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        //UserDao userDao2 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
        //System.out.println(userDao2);

    }

    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Customer customer = (Customer) app.getBean("customer");
        System.out.println(customer);
    }

    @Test
    public void test12(){
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) app.getBean("conn");
        System.out.println(conn);
    }

    @Test
    public void test18(){
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) app.getBean("person");
        System.out.println(person);
    }

    @Test
    public void test19(){
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Category category = (Category) app.getBean("category");
        System.out.println(category);
    }

    @Test
    public void test20(){
        UserService userService = new UserServiceProxy();
        userService.login("xjn","12344");
        userService.register(new User());
    }

    @Test
    public void test21(){
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.login("xjn","1234");
        userService.register(new User());

    }

}

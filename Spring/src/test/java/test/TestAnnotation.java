package test;

import bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("/applicationContext.xml");
//        User user = (User) app.getBean("u");
//        System.out.println(user);
        String[] applicationName = app.getBeanDefinitionNames();
        for(String str:applicationName){
            System.out.println(str);
        }
    }
}

package service.Impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserSerivce;

public class UserServiceImpl implements UserSerivce {

    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = new UserDaoImpl();

        userDao.save();
    }
}

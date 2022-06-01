package factory;

import dao.UserDao;

public class DynamicFactory {
    public UserDao getUserDao(){
        UserDao userDao = null;
        try {
            Class<?> clazz = Class.forName("dao.impl.UserDaoImpl");
            userDao = (UserDao) clazz.newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return userDao;

    }
}

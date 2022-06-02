package com.demo.dao;

import com.demo.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDetailDapImpl implements UserDetailsDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findUserByUsername(String username) {
        return sessionFactory.getCurrentSession().get(User.class,username);
    }
}

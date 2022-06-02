package com.demo.dao;

import com.demo.model.User;

public interface UserDetailsDao {
    User findUserByUsername(String username);
}

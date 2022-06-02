package com.demo.service;

import com.demo.dao.UserDetailsDao;
import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.transaction.Transactional;

import static org.springframework.security.core.userdetails.User.withUsername;

public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserDetailsDao userDetailsDao;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDetailsDao.findUserByUsername(username);
        org.springframework.security.core.userdetails.User.UserBuilder builder = null;
        if(user!=null){
            builder =withUsername(username);
            builder.disabled(!user.isEnabled());
            builder.password(user.getPassword());
            String[] authorities = user.getAuthoritiesSet().stream().map(a->a.getAuthority()).toArray(String[]::new);
            builder.authorities((authorities));
        }else{
            throw new UsernameNotFoundException("User not found");
        }
        return builder.build();

    }
}

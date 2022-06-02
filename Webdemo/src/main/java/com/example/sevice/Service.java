package com.example.sevice;

import com.example.dao.Dao;

public class Service {
    public String S(String str){
        Dao dao = new Dao();
        return dao.S(str);
    }
}

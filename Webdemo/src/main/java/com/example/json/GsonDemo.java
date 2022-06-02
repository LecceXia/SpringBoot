package com.example.json;

import com.google.gson.Gson;

public class GsonDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("xjn");
        user.setPassword("123");

        Gson gson =new Gson();
        String json = gson.toJson(user);
        System.out.println(json);

        User user1 = gson.fromJson("{\"id\":1,\"username\":\"xjn\",\"password\":\"123\"}", User.class);
        System.out.println(user1);
    }
}

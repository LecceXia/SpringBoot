package dao.impl;

import dao.UserDao;

import java.util.Map;

public class UserDaoImpl implements UserDao {
    private int id;
    private String name;
    private Map<String,String> map;

    public UserDaoImpl(){
        System.out.println("UserDaoImpl>>>>");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init()");
    }

    public void destroy(){
        System.out.println("destroy()");
    }

    public void save(){
        System.out.println("save running....");
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", map=" + map +
                '}';
    }
}

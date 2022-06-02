package com.demo.config;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScan(value = "com.demo")
public class AppConfig {

    @Autowired
    private Environment env;

    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        Properties props = new Properties();

        props.put(DRIVER, env.getProperty("mysql.driver"));
        props.put(URL, env.getProperty("mysql.jdbcUrl"));
        props.put(USER, env.getProperty("mysql.username"));
        props.put(PASS, env.getProperty("mysql.password"));
        props.put(DIALECT, env.getProperty("mysql.dialect"));
    }
}

package com.mySpringBootApp.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:custom.properties")
public class ReadCustomProperties {
    @Value("${uname}")
    String userName;
    @Value("${pasd}")
    String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void display()
    {
        System.out.println("Values fetched from custom properties file: username: " + userName + ", password: " + password);
    }
}

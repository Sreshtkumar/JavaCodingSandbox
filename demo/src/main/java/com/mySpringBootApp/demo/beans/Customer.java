package com.mySpringBootApp.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//Method 2 to read properties from application properties is by using @ Configuration Properties annotation
@ConfigurationProperties
public class Customer {

    //These variables should match the variables in application.properties file when using @ConfigurationProperties annotation
    String uname;
    String pasd;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasd() {
        return pasd;
    }

    public void setPasd(String pasd) {
        this.pasd = pasd;
    }
    /*    // Below is using @Value annotation
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
        System.out.println("username: " + userName + " password:" + password);
    }*/

    public void display()
    {
        System.out.println("username: " + uname + ", password: " + pasd);
    }


}

package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

@Component
public class Admin {
    private String name;
    private String userName;
    private String password;

    public Admin()
    {

    }
    public Admin(String name)
    {
        this.name=name;
    }
    public Admin(String name,String userName,String password){
        this.name=name;
        this.userName=userName;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }
}
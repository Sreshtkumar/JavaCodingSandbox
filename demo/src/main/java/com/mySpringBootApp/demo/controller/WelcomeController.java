package com.mySpringBootApp.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WelcomeController {

    WelcomeController()
    {
        System.out.println("Constructor is getting executed");
    }

    public void display()
    {
        System.out.println("Display method is getting executed");
    }
}


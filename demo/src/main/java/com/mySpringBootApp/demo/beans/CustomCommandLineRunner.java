package com.mySpringBootApp.demo.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is an overridden method of Command Line Runner Interface");
    }
}

package com.mySpringBootApp.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emp {

    //Field-level injection
    @Autowired
    Address address;

    Emp()
    {
        System.out.println("Emp constructor is getting invoked");
    }

/*    //Contructor Injection
    @Autowired
    public Emp(Address address) {
        super();
        this.address = address;

    }*/

    /*    // Setter Injection using getters and setters
    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }*/

    public void disp()
    {
        System.out.println(address.addr());
    }
}

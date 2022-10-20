package com.haresh.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

    @Autowired
    private Heart heart;


    public void heartPumping() {
        if (heart != null)
            heart.pump();
        else
            System.out.println("You are dead.!");
    }
}

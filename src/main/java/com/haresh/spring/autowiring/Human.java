package com.haresh.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;


    public void heartPumping() {
        if (heart != null)
            heart.pump();
        else
            System.out.println("You are dead.!");
    }
}

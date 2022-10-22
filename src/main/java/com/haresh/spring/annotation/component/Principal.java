package com.haresh.spring.annotation.component;

import org.springframework.stereotype.Component;

@Component
public class Principal {
    public void principalInfo() {
        System.out.println("Hello from principal");
    }
}

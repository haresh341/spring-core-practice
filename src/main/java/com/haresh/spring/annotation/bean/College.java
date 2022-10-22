package com.haresh.spring.annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class College {
    private Principal principal;

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void collegeInfo() {
        System.out.println("Hello from college");
        principal.principalInfo();
    }
}

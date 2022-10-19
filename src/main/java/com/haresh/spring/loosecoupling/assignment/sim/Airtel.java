package com.haresh.spring.loosecoupling.assignment.sim;

import com.haresh.spring.loosecoupling.assignment.service.Service;

public class Airtel implements Sim {

    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public void calling() {
        System.out.println("calling from airtel sim");
    }

    @Override
    public void data() {
        System.out.println("browsing from airtel sim");
    }

    @Override
    public void service() {
        service.service();
    }
}

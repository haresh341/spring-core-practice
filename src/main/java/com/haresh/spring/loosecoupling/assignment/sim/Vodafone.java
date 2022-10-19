package com.haresh.spring.loosecoupling.assignment.sim;


import com.haresh.spring.loosecoupling.assignment.service.Service;
import com.haresh.spring.loosecoupling.assignment.sim.Sim;

public class Vodafone implements Sim {

    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public void calling() {
        System.out.println("calling from vodafone sim");
    }

    @Override
    public void data() {
        System.out.println("browsing from vodafone sim");
    }

    @Override
    public void service() {
        service.service();
    }
}

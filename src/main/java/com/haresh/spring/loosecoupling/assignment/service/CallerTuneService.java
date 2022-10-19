package com.haresh.spring.loosecoupling.assignment.service;

import com.haresh.spring.loosecoupling.assignment.service.Service;

public class CallerTuneService implements Service {
    @Override
    public void service() {
        System.out.println("caller tune service");
    }
}

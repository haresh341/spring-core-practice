package com.haresh.spring.loosecoupling.assignment.service;

import com.haresh.spring.loosecoupling.assignment.service.Service;

public class MessageService implements Service {
    @Override
    public void service() {
        System.out.println("Messaging service");
    }
}

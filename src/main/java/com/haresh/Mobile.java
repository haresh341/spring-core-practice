package com.haresh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Sim sim = ctx.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
    }
}

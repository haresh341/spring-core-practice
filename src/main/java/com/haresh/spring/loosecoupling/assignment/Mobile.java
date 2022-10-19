package com.haresh.spring.loosecoupling.assignment;

import com.haresh.spring.loosecoupling.assignment.sim.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans_lc.xml");
        Sim sim = ctx.getBean("vodafoneSim", Sim.class);
        sim.calling();
        sim.data();
        sim.service();
    }
}

package com.haresh.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_p.xml");
        Student haresh = context.getBean("haresh", Student.class);
        haresh.display();

    }
}

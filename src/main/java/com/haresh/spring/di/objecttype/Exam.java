package com.haresh.spring.di.objecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student haresh = context.getBean("haresh",Student.class);
        Student jalak = context.getBean("jalak",Student.class);
        haresh.cheating();
        jalak.cheating();
    }
}

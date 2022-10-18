package com.haresh.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student haresh = context.getBean("student",Student.class);
        Student jalak = context.getBean("student2",Student.class);
        haresh.displayStudentInfo();
        jalak.displayStudentInfo();
    }
}

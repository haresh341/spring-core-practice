package com.haresh.spring.annotation.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = context.getBean("collegeBean", College.class);
        college.collegeInfo();
        context.close();
    }
}

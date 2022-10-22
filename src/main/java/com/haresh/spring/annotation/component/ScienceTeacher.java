package com.haresh.spring.annotation.component;


import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("I am jalak, your science teacher.!");
    }
}

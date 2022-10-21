package com.haresh.spring.properties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value("${student.hobby}")
    private String hobby;

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void display() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", interestedCourse='" + interestedCourse + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

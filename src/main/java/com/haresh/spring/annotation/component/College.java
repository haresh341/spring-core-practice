package com.haresh.spring.annotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("${college.name}")
    private String name;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    public void collegeInfo() {
        System.out.println("Hello from college");
        principal.principalInfo();
        teacher.teach();
    }
}

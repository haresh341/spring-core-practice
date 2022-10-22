package com.haresh.spring.annotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public Principal principal() {
        return new Principal();
    }

    @Bean
    public College collegeBean() {
        College college = new College();
        college.setPrincipal(principal());
        return college;
    }
}

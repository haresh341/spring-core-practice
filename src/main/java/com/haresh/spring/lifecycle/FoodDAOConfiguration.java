package com.haresh.spring.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:database.properties")
public class FoodDAOConfiguration {

    @Bean
    public FoodDAO foodDAO() {
        return new FoodDAO();
    }

    @Bean
    public CommonAnnotationBeanPostProcessor processor() {
        return new CommonAnnotationBeanPostProcessor();
    }
}

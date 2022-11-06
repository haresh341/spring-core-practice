package com.haresh.spring.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import java.sql.SQLException;

public class Main {

    @Autowired
    private CommonAnnotationBeanPostProcessor processor;


    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(FoodDAOConfiguration.class);
        FoodDAO foodDAO = context.getBean("foodDAO",FoodDAO.class);
        foodDAO.fetchAllFoodItems();
        context.close();
    }
}

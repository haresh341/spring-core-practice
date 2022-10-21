package com.haresh.spring.properties.assignment;

import com.haresh.spring.properties.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_p.xml");
        JDBCConn con = context.getBean("con",JDBCConn.class);
        try {
            con.testConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

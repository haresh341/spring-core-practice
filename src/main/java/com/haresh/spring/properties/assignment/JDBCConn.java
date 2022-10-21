package com.haresh.spring.properties.assignment;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConn {
    @Value("${mysql.url}")
    private String CONNECTION_URL;
    @Value("${mysql.username}")
    private String USER_NAME;
    @Value("${mysql.pwd}")
    private String USER_PASSWORD;

    public void testConnection() throws SQLException {
        Connection con = DriverManager.getConnection(CONNECTION_URL,USER_NAME,USER_PASSWORD);
        System.out.println("connection object created " + con);
    }
}

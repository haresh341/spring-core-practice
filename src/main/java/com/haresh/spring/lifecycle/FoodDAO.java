package com.haresh.spring.lifecycle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;


@Data
public class FoodDAO {

    @Value("${mysql.username}")
    private String userName;
    @Value("${mysql.pwd}")
    private String password;
    @Value("${mysql.url}")
    private String connectionURL;


    Connection conn;

    public void fetchAllFoodItems() throws SQLException {
        System.out.println("Getting all food items");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM food.foodcart");
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            double price = rs.getDouble(3);
            System.out.println(id + " " + name + " " + " " + price);
        }
    }

    public void deleteFoodItemsById(int id) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("delete from food.foodcart where id = " + id);
        System.out.println("deleted food item with id = " + id);
    }

    // custom init method
    @PostConstruct
    public void init() {
        setConection();
    }

    @PreDestroy
    public void close() {
        releaseConnection(conn);
    }

    private void setConection() {
        try {
            conn = DriverManager.getConnection(connectionURL, userName, password);
        } catch (SQLException e) {
            System.out.println("Exception getting connection " + e);
        }
    }

    private void releaseConnection(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Exception closing connection " + e.getMessage());
        }
    }
}

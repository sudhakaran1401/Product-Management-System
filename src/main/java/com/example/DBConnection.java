package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/productdb";
            String user = "root";
            String password = "pass@123";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected");

        } catch (Exception e) {

            System.out.println(e);
        }

        return con;
    }
}
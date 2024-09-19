package com.evergent.coreJava.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class HairSalonDBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hair_salon_db",
                "root",
                "admin");
    }
}


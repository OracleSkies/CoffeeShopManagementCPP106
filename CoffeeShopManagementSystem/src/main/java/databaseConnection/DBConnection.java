/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jayjay
 */
public class DBConnection {
    
    public static Connection connectionDB() {
    var dbURL = "jdbc:sqlite:coffeeDB.db";
    //TANGINA WAG MO KALIMUTAN UNG .db NA EXTENSION!!!!!!!!

    try {
        Connection conn = DriverManager.getConnection(dbURL);
        System.out.println("Connection to SQLite has been established.");
        return conn;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        return null;
    }
}
    
    public static void main(String[]args){
        connectionDB();
        
    }
}

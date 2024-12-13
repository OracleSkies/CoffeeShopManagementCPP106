/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package experimentDoNotPublish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jayjay
 */
public class databaseTest {
    
    private static void connect(){
        var dbURL = "jdbc:sqlite:coffeeDB";

        try (var conn = DriverManager.getConnection(dbURL)) {
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[]args){
        connect();
        
    }
}

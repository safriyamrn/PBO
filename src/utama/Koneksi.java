package utama;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Safriya Murni
 */
public class Koneksi {

    private static Connection conn;

    public static Connection getConnection() {
        
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://localhost:5432/login";
            String user = "postgres";
            String pass = "bismillah@";
            DriverManager.registerDriver(new org.postgresql.Driver());
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Successfully");
        }catch (Exception e) {
            System.out.println("Error");
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}

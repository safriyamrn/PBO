/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Safriya Murni
 */
public class Update {

    static final String DB_URL = "jdbc:postgresql://localhost:5433/mahasiswa";
    static final String USER = "postgres";
    static final String PASS = "bismillah";
    static final String QUERY = "update mahasiswa\n" +
                        "set alamat = 'Surabaya'\n" +
                        "where nim = '01230122005'";

    public static void main(String[] args) {
        // Open a connection
        try ( Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                //Display values
                System.out.println("nim: " + String.valueOf(rs.getObject(1)));
                System.out.println("nama: " + String.valueOf(rs.getObject(2)));
                System.out.println("jenis kelamin: " + String.valueOf(rs.getObject(3)));
                System.out.println("alamat: " + String.valueOf(rs.getObject(4)));
                System.out.println("semester: " + String.valueOf(rs.getObject(5)));
                System.out.println("                                                     ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

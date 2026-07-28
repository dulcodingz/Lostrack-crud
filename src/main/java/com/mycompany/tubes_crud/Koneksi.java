 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubes_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Koneksi {
     public static Connection getKoneksi() {
        Connection conn = null;
        try {
            String url ="jdbc:mysql://localhost:3306/db_login?serverTimezone=UTC";
            String user ="root";
            String pass = "";
            
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
            
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return conn;
    }
}

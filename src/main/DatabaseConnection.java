/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SMKN4
 */
public class DatabaseConnection {
    public static Connection getKoneksi() {
        String host = "localhost";
        String port = "3306";
        String db = "01_dbppob";
        String username = "root";
        String password = "";
        String konString = "jdbc:mysql://" + host + ":" + port + "/" + db;
        
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(konString, username, password);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi Database Error");
            koneksi = null;
        }
        return koneksi;
    }
}

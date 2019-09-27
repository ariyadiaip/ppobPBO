/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author SMKN4
 */
public class AdminController {
    static int idAdmin = 0;
    static String username = "";
    static String password = "";
    static String namaAdmin = "";
    static int idLevel = 0;

    public static int getIdAdmin() {
        return idAdmin;
    }

    public static void setIdAdmin(int idAdmin) {
        AdminController.idAdmin = idAdmin;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        AdminController.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        AdminController.password = password;
    }

    public static String getNamaAdmin() {
        return namaAdmin;
    }

    public static void setNamaAdmin(String namaAdmin) {
        AdminController.namaAdmin = namaAdmin;
    }

    public static int getIdLevel() {
        return idLevel;
    }

    public static void setIdLevel(int idLevel) {
        AdminController.idLevel = idLevel;
    }
    
    
}

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
public class UserController {
    static int idPelanggan = 0;
    static String username = "";
    static String password = "";
    static String noKwh = "";
    static String namaPelanggan = "";
    static String alamat = "";
    static int idTarif = 0;

    public static int getIdPelanggan() {
        return idPelanggan;
    }

    public static void setIdPelanggan(int idPelanggan) {
        UserController.idPelanggan = idPelanggan;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserController.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserController.password = password;
    }

    public static String getNoKwh() {
        return noKwh;
    }

    public static void setNoKwh(String noKwh) {
        UserController.noKwh = noKwh;
    }

    public static String getNamaPelanggan() {
        return namaPelanggan;
    }

    public static void setNamaPelanggan(String namaPelanggan) {
        UserController.namaPelanggan = namaPelanggan;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        UserController.alamat = alamat;
    }

    public static int getIdTarif() {
        return idTarif;
    }

    public static void setIdTarif(int idTarif) {
        UserController.idTarif = idTarif;
    }



}

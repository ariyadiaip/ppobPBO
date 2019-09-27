/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import data.*;
/**
 *
 * @author SMKN4
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String username = "";
    String password = "";
    Connection koneksi;
    public Login() {
        initComponents();
        koneksi = DatabaseConnection.getKoneksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnToRegister = new javax.swing.JLabel();
        tvQuestion = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        tPassword = new javax.swing.JPasswordField();
        tUsername = new javax.swing.JTextField();
        tvPassword = new javax.swing.JLabel();
        tvUsername = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi PPOB");
        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnToRegister.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnToRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnToRegister.setText("Register");
        btnToRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(btnToRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        tvQuestion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvQuestion.setForeground(new java.awt.Color(255, 255, 255));
        tvQuestion.setText("Belum mempunyai Akun ?");
        getContentPane().add(tvQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(68, 185, 235));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 210, 60));

        tPassword.setBackground(new java.awt.Color(68, 185, 235));
        tPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tPassword.setForeground(new java.awt.Color(255, 255, 255));
        tPassword.setBorder(null);
        tPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        tPassword.setOpaque(false);
        getContentPane().add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 275, 280, 50));

        tUsername.setBackground(new java.awt.Color(68, 185, 235));
        tUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tUsername.setForeground(new java.awt.Color(255, 255, 255));
        tUsername.setBorder(null);
        tUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        tUsername.setOpaque(false);
        getContentPane().add(tUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 280, 50));

        tvPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tvPassword.setForeground(new java.awt.Color(255, 255, 255));
        tvPassword.setText("Password");
        getContentPane().add(tvPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 245, -1, 20));

        tvUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tvUsername.setForeground(new java.awt.Color(255, 255, 255));
        tvUsername.setText("Username");
        getContentPane().add(tvUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/01_MainLogin.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnToRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToRegisterMouseClicked
        Register r = new Register();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnToRegisterMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        getData();
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan Inputan terlebih dahulu");
        } else {
            if(cekPelanggan()) {
                pelanggan.HomePelanggan hp = new pelanggan.HomePelanggan();
                hp.setVisible(true);
                this.dispose();
            }else if(cekAdmin()) {
                admin.HomeAdmin ha = new admin.HomeAdmin();
                ha.setVisible(true);
                this.dispose();
            }else if(cekBank()) {
                bank.HomeBank hb = new bank.HomeBank();
                hb.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
            }
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void getData() {
        username = tUsername.getText().toString();
        password = tPassword.getText().toString();
    }
    
    private boolean cekPelanggan() {
        String query = "SELECT * FROM pelanggan WHERE username = '"+ username +"'";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                if(password.equals(rs.getString("password"))) {
                    username = rs.getString("username");
                    UserController.setUsername(username);
                    UserController.setPassword(rs.getString("password"));
                    UserController.setNamaPelanggan(rs.getString("nama_pelanggan"));
                    UserController.setIdPelanggan(rs.getInt("id_pelanggan"));
                    UserController.setIdTarif(rs.getInt("id_tarif"));
                    UserController.setNoKwh(rs.getString("nomor_kwh"));
                    UserController.setAlamat(rs.getString("alamat"));
                    return true;
                }
            }
        } catch (SQLException e) {
            e.getCause();
            e.printStackTrace();
        }
        return false;
    }
    
    private boolean cekAdmin() {
        String query = "SELECT * FROM admin WHERE username = '"+ username +"' AND id_level = 1";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                if(password.equals(rs.getString("password"))) {
                    username = rs.getString("username");
                    AdminController.setUsername(username);
                    AdminController.setPassword(rs.getString("password"));
                    AdminController.setNamaAdmin(rs.getString("nama_admin"));
                    AdminController.setIdAdmin(rs.getInt("id_admin"));
                    AdminController.setIdLevel(rs.getInt("id_level"));
                    return true;
                }
            }
        } catch (SQLException e) {
            e.getCause();
            e.printStackTrace();
        }
        return false;
    }
    
    private boolean cekBank() {
        String query = "SELECT * FROM admin WHERE username = '"+ username +"' AND id_level = 2";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                if(password.equals(rs.getString("password"))) {
                    username = rs.getString("username");
                    AdminController.setUsername(username);
                    AdminController.setPassword(rs.getString("password"));
                    AdminController.setNamaAdmin(rs.getString("nama_admin"));
                    AdminController.setIdAdmin(rs.getInt("id_admin"));
                    AdminController.setIdLevel(rs.getInt("id_level"));
                    return true;
                }
            }
        } catch (SQLException e) {
            e.getCause();
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnToRegister;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tUsername;
    private javax.swing.JLabel tvPassword;
    private javax.swing.JLabel tvQuestion;
    private javax.swing.JLabel tvUsername;
    // End of variables declaration//GEN-END:variables
}
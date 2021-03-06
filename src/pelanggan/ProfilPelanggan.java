/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelanggan;

import data.AdminController;
import data.UserController;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import main.Login;

/**
 *
 * @author SMKN4
 */
public class ProfilPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdmin
     */
    Connection koneksi;
    public ProfilPelanggan() {
        initComponents();
        koneksi = main.DatabaseConnection.getKoneksi();
        tvNama.setText(UserController.getNamaPelanggan());
        edtName.setText(UserController.getNamaPelanggan());
        edtUsername.setText(UserController.getUsername());
        edtNoKwh.setText(UserController.getNoKwh());
        edtAlamat.setText(UserController.getAlamat());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleFrame = new javax.swing.JLabel();
        edtAlamat = new javax.swing.JTextField();
        separator5 = new javax.swing.JSeparator();
        edtNoKwh = new javax.swing.JTextField();
        separator4 = new javax.swing.JSeparator();
        separator3 = new javax.swing.JSeparator();
        btnToPwEdit = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        separator2 = new javax.swing.JSeparator();
        edtUsername = new javax.swing.JTextField();
        edtName = new javax.swing.JTextField();
        separator1 = new javax.swing.JSeparator();
        menuRiwayat = new javax.swing.JLabel();
        menuProfil = new javax.swing.JLabel();
        menuHome = new javax.swing.JLabel();
        tvNama = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleFrame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleFrame.setForeground(new java.awt.Color(68, 185, 235));
        titleFrame.setText("Profil Pelanggan");
        getContentPane().add(titleFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        edtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edtAlamat.setForeground(new java.awt.Color(68, 185, 235));
        edtAlamat.setText("Alamat");
        edtAlamat.setBorder(null);
        edtAlamat.setCaretColor(new java.awt.Color(68, 185, 235));
        edtAlamat.setOpaque(false);
        getContentPane().add(edtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 280, 50));

        separator5.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 280, 10));

        edtNoKwh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edtNoKwh.setForeground(new java.awt.Color(68, 185, 235));
        edtNoKwh.setText("No. Kwh");
        edtNoKwh.setBorder(null);
        edtNoKwh.setCaretColor(new java.awt.Color(68, 185, 235));
        edtNoKwh.setOpaque(false);
        getContentPane().add(edtNoKwh, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 280, 50));

        separator4.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 280, 10));

        separator3.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 10));

        btnToPwEdit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnToPwEdit.setText("Ubah Password");
        btnToPwEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToPwEditMouseClicked(evt);
            }
        });
        getContentPane().add(btnToPwEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        btnSimpan.setBackground(new java.awt.Color(68, 185, 235));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(null);
        btnSimpan.setOpaque(false);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 110, 40));

        separator2.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 280, 10));

        edtUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edtUsername.setForeground(new java.awt.Color(68, 185, 235));
        edtUsername.setText("Username");
        edtUsername.setBorder(null);
        edtUsername.setCaretColor(new java.awt.Color(68, 185, 235));
        edtUsername.setOpaque(false);
        getContentPane().add(edtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 280, 50));

        edtName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        edtName.setForeground(new java.awt.Color(68, 185, 235));
        edtName.setText("Nama");
        edtName.setBorder(null);
        edtName.setCaretColor(new java.awt.Color(68, 185, 235));
        edtName.setOpaque(false);
        getContentPane().add(edtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 280, 50));

        separator1.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 280, 10));

        menuRiwayat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        menuRiwayat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuRiwayat.setText("Riwayat");
        menuRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRiwayatMouseClicked(evt);
            }
        });
        getContentPane().add(menuRiwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 265, 60));

        menuProfil.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuProfil.setForeground(new java.awt.Color(255, 255, 255));
        menuProfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuProfil.setText("Profil");
        getContentPane().add(menuProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 265, 60));

        menuHome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuHome.setForeground(new java.awt.Color(255, 255, 255));
        menuHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHome.setText("Beranda");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        getContentPane().add(menuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 265, 60));

        tvNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvNama.setForeground(new java.awt.Color(255, 255, 255));
        tvNama.setText("Nama");
        getContentPane().add(tvNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/01_Menu2Admin.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int p = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin Keluar ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (p == 0) {
            Login i = new Login();
            i.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        HomePelanggan i = new HomePelanggan();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRiwayatMouseClicked
        RiwayatPelanggan i = new RiwayatPelanggan();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuRiwayatMouseClicked

    private void btnToPwEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToPwEditMouseClicked
        ProfilPelangganPassword i = new ProfilPelangganPassword();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnToPwEditMouseClicked

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        if (edtName.getText().equals("") || edtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh Kosong");
        } else {
            UserController.setNamaPelanggan(edtName.getText().toString());
            UserController.setUsername(edtUsername.getText().toString());
            UserController.setAlamat(edtAlamat.getText().toString());
            UserController.setNoKwh(edtNoKwh.getText().toString());
            try {
                Statement stmt = koneksi.createStatement();
                String query = "UPDATE pelanggan SET username = '"+UserController.getUsername()+"', nama_pelanggan = '" + UserController.getNamaPelanggan()+ "', nomor_kwh = '"+ UserController.getNoKwh() +"', alamat = '" + UserController.getAlamat() + "' WHERE id_pelanggan = "+UserController.getIdPelanggan()+"";
                System.out.println(query);
                int berhasil = stmt.executeUpdate(query);
                if (berhasil == 1) {
                    JOptionPane.showMessageDialog(null, "Setting Berhasil");
                    tvNama.setText(UserController.getNamaPelanggan());
                } else {
                    JOptionPane.showMessageDialog(null, "Setting Gagal");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada Database");
            }
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

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
            java.util.logging.Logger.getLogger(ProfilPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel btnToPwEdit;
    private javax.swing.JTextField edtAlamat;
    private javax.swing.JTextField edtName;
    private javax.swing.JTextField edtNoKwh;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JLabel menuHome;
    private javax.swing.JLabel menuProfil;
    private javax.swing.JLabel menuRiwayat;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    private javax.swing.JSeparator separator4;
    private javax.swing.JSeparator separator5;
    private javax.swing.JLabel titleFrame;
    private javax.swing.JLabel tvNama;
    // End of variables declaration//GEN-END:variables
}

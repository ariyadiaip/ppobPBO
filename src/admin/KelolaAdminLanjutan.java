/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import main.Login;

/**
 *
 * @author SMKN4
 */
public class KelolaAdminLanjutan extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdmin
     */
    String noKWh;
    Connection koneksi;
    public KelolaAdminLanjutan(String noKwh) {
        initComponents();
        koneksi = main.DatabaseConnection.getKoneksi();
        tvNama.setText(data.AdminController.getNamaAdmin());
        showDaya();
        showData(noKwh);
        noKWh = noKwh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JLabel();
        cmbDaya = new javax.swing.JComboBox<>();
        tvNamaPelanggan = new javax.swing.JLabel();
        tvNoKwh = new javax.swing.JLabel();
        tvAlamat = new javax.swing.JLabel();
        tvDayaTarif = new javax.swing.JLabel();
        titleFrame = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        menuLaporan = new javax.swing.JLabel();
        menuKelola = new javax.swing.JLabel();
        menuProfil = new javax.swing.JLabel();
        menuHome = new javax.swing.JLabel();
        tvNama = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnLogout = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBack.setText("< Batal");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        getContentPane().add(cmbDaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 120, -1));

        tvNamaPelanggan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvNamaPelanggan.setText("Nama : Nama Pelanggan");
        getContentPane().add(tvNamaPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        tvNoKwh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvNoKwh.setText("No Kwh : 1234567890");
        getContentPane().add(tvNoKwh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        tvAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvAlamat.setText("Alamat : Alamat Pelanggan");
        getContentPane().add(tvAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        tvDayaTarif.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvDayaTarif.setText("Daya Rumah :");
        getContentPane().add(tvDayaTarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        titleFrame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleFrame.setForeground(new java.awt.Color(68, 185, 235));
        titleFrame.setText("Kelola Data Pelanggan");
        getContentPane().add(titleFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        separator.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 142, 190, 10));

        menuLaporan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuLaporan.setForeground(new java.awt.Color(255, 255, 255));
        menuLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLaporan.setText("Laporan");
        getContentPane().add(menuLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 315, 265, 60));

        menuKelola.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuKelola.setForeground(new java.awt.Color(255, 255, 255));
        menuKelola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuKelola.setText("Kelola Data");
        getContentPane().add(menuKelola, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 265, 60));

        menuProfil.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuProfil.setForeground(new java.awt.Color(255, 255, 255));
        menuProfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuProfil.setText("Profil");
        getContentPane().add(menuProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 265, 60));

        menuHome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuHome.setForeground(new java.awt.Color(255, 255, 255));
        menuHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHome.setText("Beranda");
        getContentPane().add(menuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 265, 60));

        tvNama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvNama.setForeground(new java.awt.Color(255, 255, 255));
        tvNama.setText("Nama");
        getContentPane().add(tvNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

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

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/01_Menu3Admin.png"))); // NOI18N
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

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        KelolaAdmin i = new KelolaAdmin();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        if (cmbDaya.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Data tidak Valid");
        } else {
            try {
                Statement stmt = koneksi.createStatement();
                String query = "UPDATE pelanggan SET id_tarif = "+ cmbDaya.getSelectedIndex() +" WHERE nomor_kwh = "+ noKWh +"";
                System.out.println(query);
                int berhasil = stmt.executeUpdate(query);
                if (berhasil == 1) {
                    JOptionPane.showMessageDialog(null, "Setting Berhasil");
                    KelolaAdmin i = new KelolaAdmin();
                    i.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Setting Gagal");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada Database");
            }
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void showData(String noKwh) {
        String q = "SELECT * FROM pelanggan, tarif WHERE (pelanggan.id_tarif = tarif.id_tarif) AND (nomor_kwh = '"+noKwh+"')";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            if (rs.next()) {
                tvNamaPelanggan.setText("Nama : " + rs.getString("nama_pelanggan"));
                tvNoKwh.setText("No Kwh : " + rs.getString("nomor_kwh"));
                tvAlamat.setText("Alamat : " + rs.getString("alamat"));
                cmbDaya.setSelectedItem(rs.getString("daya"));
            }
        } catch (SQLException e) {
            e.getCause();
            e.printStackTrace();
        }
    }
    
    private void showDaya() {
        try {
            Statement stmt = koneksi.createStatement();
            String q = "SELECT * FROM tarif";
            ResultSet rs = stmt.executeQuery(q);
            cmbDaya.addItem("[ PILIH DAYA ]");
            while (rs.next()) {
                cmbDaya.addItem(rs.getString("daya"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(KelolaAdminLanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaAdminLanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaAdminLanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaAdminLanjutan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new KelolaAdminLanjutan().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbDaya;
    private javax.swing.JLabel menuHome;
    private javax.swing.JLabel menuKelola;
    private javax.swing.JLabel menuLaporan;
    private javax.swing.JLabel menuProfil;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel titleFrame;
    private javax.swing.JLabel tvAlamat;
    private javax.swing.JLabel tvDayaTarif;
    private javax.swing.JLabel tvNama;
    private javax.swing.JLabel tvNamaPelanggan;
    private javax.swing.JLabel tvNoKwh;
    // End of variables declaration//GEN-END:variables
}
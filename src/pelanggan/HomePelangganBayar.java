/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelanggan;

import javax.swing.JOptionPane;
import main.Login;


/**
 *
 * @author SMKN4
 */
public class HomePelangganBayar extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdmin
     */
    public HomePelangganBayar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBayar = new javax.swing.JButton();
        tvTotalBayar = new javax.swing.JLabel();
        tvBiayaAdmin = new javax.swing.JLabel();
        tvJumlahTagihan = new javax.swing.JLabel();
        tvRp1 = new javax.swing.JLabel();
        tvRp = new javax.swing.JLabel();
        tvJumlahMeter = new javax.swing.JLabel();
        tvMeterAkhir = new javax.swing.JLabel();
        tvMeterAwal = new javax.swing.JLabel();
        tvBulanBayar = new javax.swing.JLabel();
        tvDayaTarif = new javax.swing.JLabel();
        tvInstruction = new javax.swing.JLabel();
        tvAlamat = new javax.swing.JLabel();
        tvNoKwh = new javax.swing.JLabel();
        tvNamaPelanggan = new javax.swing.JLabel();
        edtNominal = new javax.swing.JTextField();
        separator2 = new javax.swing.JSeparator();
        titleFrame1 = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        titleFrame = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        btnBack = new javax.swing.JLabel();
        menuHistory = new javax.swing.JLabel();
        menuProfil = new javax.swing.JLabel();
        menuHome = new javax.swing.JLabel();
        tvNama = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBayar.setBackground(new java.awt.Color(68, 185, 235));
        btnBayar.setText("Bayar");
        btnBayar.setBorder(null);
        btnBayar.setOpaque(false);
        btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 110, 40));

        tvTotalBayar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tvTotalBayar.setText("Total Bayar : Rp. 203500");
        getContentPane().add(tvTotalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        tvBiayaAdmin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvBiayaAdmin.setText("Biaya Admin : Rp. 2500");
        getContentPane().add(tvBiayaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

        tvJumlahTagihan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvJumlahTagihan.setText("Jumlah Tagihan : Rp. 201000");
        getContentPane().add(tvJumlahTagihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        tvRp1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tvRp1.setForeground(new java.awt.Color(68, 185, 255));
        tvRp1.setText("*Pembayaran Anda akan divalidasi terlebih dahulu paling lambat 1 x 24 Jam");
        getContentPane().add(tvRp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        tvRp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvRp.setForeground(new java.awt.Color(68, 185, 255));
        tvRp.setText("Rp. ");
        getContentPane().add(tvRp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        tvJumlahMeter.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvJumlahMeter.setText("Jumlah Meter : 2204");
        getContentPane().add(tvJumlahMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        tvMeterAkhir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvMeterAkhir.setText("Meter Akhir : 2304");
        getContentPane().add(tvMeterAkhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        tvMeterAwal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvMeterAwal.setText("Meter Awal : 100");
        getContentPane().add(tvMeterAwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        tvBulanBayar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvBulanBayar.setText("Bulan Bayar : April 2019");
        getContentPane().add(tvBulanBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        tvDayaTarif.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvDayaTarif.setText("Daya Rumah : R1M/240V");
        getContentPane().add(tvDayaTarif, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        tvInstruction.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvInstruction.setForeground(new java.awt.Color(68, 185, 255));
        tvInstruction.setText("Masukkan Nominal Uang");
        getContentPane().add(tvInstruction, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        tvAlamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvAlamat.setText("Alamat : Alamat Pelanggan");
        getContentPane().add(tvAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        tvNoKwh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvNoKwh.setText("No Kwh : 1234567890");
        getContentPane().add(tvNoKwh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        tvNamaPelanggan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tvNamaPelanggan.setText("Nama : Nama Pelanggan");
        getContentPane().add(tvNamaPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        edtNominal.setBackground(new java.awt.Color(68, 185, 235));
        edtNominal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtNominal.setForeground(new java.awt.Color(68, 185, 235));
        edtNominal.setBorder(null);
        edtNominal.setCaretColor(new java.awt.Color(68, 185, 235));
        edtNominal.setOpaque(false);
        getContentPane().add(edtNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 280, 40));

        separator2.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 300, 10));

        titleFrame1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleFrame1.setForeground(new java.awt.Color(68, 185, 235));
        titleFrame1.setText("Detail Pembayaran");
        getContentPane().add(titleFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        separator1.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 160, 10));

        titleFrame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleFrame.setForeground(new java.awt.Color(68, 185, 235));
        titleFrame.setText("Data Pelanggan");
        getContentPane().add(titleFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        separator.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 142, 140, 10));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBack.setText("< Batal");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        menuHistory.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuHistory.setForeground(new java.awt.Color(255, 255, 255));
        menuHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHistory.setText("Riwayat");
        menuHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHistoryMouseClicked(evt);
            }
        });
        getContentPane().add(menuHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 265, 60));

        menuProfil.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuProfil.setForeground(new java.awt.Color(255, 255, 255));
        menuProfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuProfil.setText("Profil");
        menuProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProfilMouseClicked(evt);
            }
        });
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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/01_Menu1Admin.png"))); // NOI18N
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
        
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuProfilMouseClicked

    private void menuHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHistoryMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        HomePelanggan i = new HomePelanggan();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBayarMouseClicked

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
            java.util.logging.Logger.getLogger(HomePelangganBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePelangganBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePelangganBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePelangganBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new HomePelangganBayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnBayar;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JTextField edtNominal;
    private javax.swing.JLabel menuHistory;
    private javax.swing.JLabel menuHome;
    private javax.swing.JLabel menuProfil;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JLabel titleFrame;
    private javax.swing.JLabel titleFrame1;
    private javax.swing.JLabel tvAlamat;
    private javax.swing.JLabel tvBiayaAdmin;
    private javax.swing.JLabel tvBulanBayar;
    private javax.swing.JLabel tvDayaTarif;
    private javax.swing.JLabel tvInstruction;
    private javax.swing.JLabel tvJumlahMeter;
    private javax.swing.JLabel tvJumlahTagihan;
    private javax.swing.JLabel tvMeterAkhir;
    private javax.swing.JLabel tvMeterAwal;
    private javax.swing.JLabel tvNama;
    private javax.swing.JLabel tvNamaPelanggan;
    private javax.swing.JLabel tvNoKwh;
    private javax.swing.JLabel tvRp;
    private javax.swing.JLabel tvRp1;
    private javax.swing.JLabel tvTotalBayar;
    // End of variables declaration//GEN-END:variables
}
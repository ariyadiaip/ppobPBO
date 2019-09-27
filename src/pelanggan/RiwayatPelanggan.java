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
public class RiwayatPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form HomePelanggan
     */
    public RiwayatPelanggan() {
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

        titleFrame = new javax.swing.JLabel();
        btnCek = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPembayaran = new javax.swing.JTable();
        separator = new javax.swing.JSeparator();
        menuHistory = new javax.swing.JLabel();
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
        titleFrame.setText("Riwayat Pembayaran Listrik");
        getContentPane().add(titleFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        btnCek.setBackground(new java.awt.Color(68, 185, 235));
        btnCek.setText("Bukti Pembayaran");
        btnCek.setBorder(null);
        btnCek.setOpaque(false);
        btnCek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCekMouseClicked(evt);
            }
        });
        getContentPane().add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 140, 40));

        tblPembayaran.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Bulan Bayar", "Jumlah Penggunaan", "Total Bayar", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPembayaran);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 610, 260));

        separator.setForeground(new java.awt.Color(68, 185, 235));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 230, 10));

        menuHistory.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        menuHistory.setForeground(new java.awt.Color(255, 255, 255));
        menuHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuHistory.setText("Riwayat");
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

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        HomePelanggan i = new HomePelanggan();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProfilMouseClicked
        ProfilPelanggan i = new ProfilPelanggan();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuProfilMouseClicked

    private void btnCekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCekMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCekMouseClicked

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
            java.util.logging.Logger.getLogger(RiwayatPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RiwayatPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menuHistory;
    private javax.swing.JLabel menuHome;
    private javax.swing.JLabel menuProfil;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable tblPembayaran;
    private javax.swing.JLabel titleFrame;
    private javax.swing.JLabel tvNama;
    // End of variables declaration//GEN-END:variables
}

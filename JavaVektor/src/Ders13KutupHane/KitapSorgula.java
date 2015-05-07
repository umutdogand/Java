/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ders13KutupHane;

import Ders13KutupHanePojo.KitapPojo;
import Ders13KutuphaneDao.KitapDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vektorel
 */
public class KitapSorgula extends javax.swing.JFrame {

    /**
     * Creates new form KitapSorgula
     */
    public KitapSorgula() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArama = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKitap = new javax.swing.JTable();
        btnKapat = new javax.swing.JButton();
        cmbArama = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArama = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kitap Sorgulama");
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(440, 340));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        btnArama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        btnArama.setText("Ara");
        btnArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAramaActionPerformed(evt);
            }
        });
        jPanel1.add(btnArama);
        btnArama.setBounds(10, 30, 77, 33);

        tblKitap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adi", "Kitap No", "Raf No", "Yazar"
            }
        ));
        jScrollPane2.setViewportView(tblKitap);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 90, 410, 170);

        btnKapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-application-exit-icon.png"))); // NOI18N
        btnKapat.setText("Kapat");
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });
        jPanel1.add(btnKapat);
        btnKapat.setBounds(330, 270, 89, 33);

        cmbArama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbArama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "adi", "yazari", "Kodu", "RafNo" }));
        jPanel1.add(cmbArama);
        cmbArama.setBounds(100, 30, 140, 30);

        jScrollPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(txtArama);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(250, 30, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maxresdefault.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 310);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnKapatActionPerformed

    private void btnAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAramaActionPerformed
        String kolon = cmbArama.getSelectedItem().toString();
        String deger = txtArama.getText();
        
        KitapDao kitapDao = new KitapDao();
        List<KitapPojo> listKitap = kitapDao.getKitap(kolon, deger);
        
        DefaultTableModel model = (DefaultTableModel) tblKitap.getModel();
        model.setRowCount(0);
        for (KitapPojo kitap : listKitap) {
            model.addRow(new Object[]{kitap.getAdi(),kitap.getKodu(),kitap.getRafNo(),kitap.getRafNo()});
        }
        
    }//GEN-LAST:event_btnAramaActionPerformed

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
            java.util.logging.Logger.getLogger(KitapSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapSorgula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapSorgula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArama;
    private javax.swing.JButton btnKapat;
    private javax.swing.JComboBox cmbArama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblKitap;
    private javax.swing.JTextPane txtArama;
    // End of variables declaration//GEN-END:variables
}

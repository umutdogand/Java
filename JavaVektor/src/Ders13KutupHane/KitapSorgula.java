/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13KutupHane;

import Ders13KutupHanePojo.KitapPojo;
import Ders13KutuphaneDao.IslemDao;
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
        btnSil = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblhata = new javax.swing.JLabel();
        btnIslem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kitap Sorgulama");
        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(530, 380));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 390));
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
                "Id", "Adi", "Kitap No", "Raf No", "Yazar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKitap.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblKitap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tblKitap);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 90, 510, 170);

        btnKapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-application-exit-icon.png"))); // NOI18N
        btnKapat.setText("Kapat");
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });
        jPanel1.add(btnKapat);
        btnKapat.setBounds(410, 300, 89, 33);

        cmbArama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbArama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "adi", "yazari", "Kodu", "RafNo" }));
        jPanel1.add(cmbArama);
        cmbArama.setBounds(100, 30, 140, 30);

        jScrollPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(txtArama);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(250, 30, 170, 30);

        btnSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnSil.setText("Sil");
        btnSil.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSil.setMaximumSize(new java.awt.Dimension(89, 33));
        btnSil.setMinimumSize(new java.awt.Dimension(89, 33));
        btnSil.setPreferredSize(new java.awt.Dimension(89, 33));
        btnSil.setVerifyInputWhenFocusTarget(false);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel1.add(btnSil);
        btnSil.setBounds(170, 300, 89, 33);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        btnUpdate.setText("Güncelle");
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate.setMaximumSize(new java.awt.Dimension(89, 33));
        btnUpdate.setMinimumSize(new java.awt.Dimension(89, 33));
        btnUpdate.setPreferredSize(new java.awt.Dimension(89, 33));
        btnUpdate.setVerifyInputWhenFocusTarget(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(280, 300, 110, 33);

        lblhata.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblhata);
        lblhata.setBounds(20, 340, 290, 20);

        btnIslem.setText("Islem");
        btnIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIslemActionPerformed(evt);
            }
        });
        jPanel1.add(btnIslem);
        btnIslem.setBounds(10, 300, 57, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maxresdefault.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(89, 33));
        jLabel1.setMinimumSize(new java.awt.Dimension(89, 33));
        jLabel1.setPreferredSize(new java.awt.Dimension(530, 380));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 380);

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
            model.addRow(new Object[]{kitap.getId(), kitap.getAdi(), kitap.getKodu(), kitap.getRafNo(), kitap.getRafNo()});
        }

    }//GEN-LAST:event_btnAramaActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblKitap.getModel();
        int id;
        int a = tblKitap.getSelectedRow();
        if (a != -1) {
            id = (int) model.getValueAt(a, 0);

            KitapPojo kitap = new KitapPojo();
            kitap.setId(id);

            IslemDao islem = new IslemDao();
            islem.delete(kitap);

            model.removeRow(a);
        } else {
            lblhata.setText("Öncelikle Tablodan Kayıt Seçmelisiniz");
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblKitap.getModel();
        int id;
        int a = tblKitap.getSelectedRow();
        if (a != -1) {

            KitapPojo kitap = new KitapPojo();

            kitap.setId((int) model.getValueAt(a, 0));
            kitap.setAdi((String) model.getValueAt(a, 1));
            kitap.setKodu((String) model.getValueAt(a, 2));
            kitap.setRafNo((String) model.getValueAt(a, 3));
            kitap.setYazari((String) model.getValueAt(a, 4));

            IslemDao islem = new IslemDao();
            islem.update(kitap);

        } else {
            lblhata.setText("Öncelikle Tablodan Kayıt Seçmelisiniz");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIslemActionPerformed
        KitapDao kitapDao = new KitapDao();
        List<Object[]> listKitap = kitapDao.getProjectionsKitap();
        DefaultTableModel model = (DefaultTableModel) tblKitap.getModel();
        model.setRowCount(0);

        for (Object[] kitap : listKitap) {
            for (int i = 0; i < kitap.length; i++) {
                 System.out.println(kitap[i]);    
            }
            
        }     
    }//GEN-LAST:event_btnIslemActionPerformed

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
    private javax.swing.JButton btnIslem;
    private javax.swing.JButton btnKapat;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbArama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblhata;
    private javax.swing.JTable tblKitap;
    private javax.swing.JTextPane txtArama;
    // End of variables declaration//GEN-END:variables
}

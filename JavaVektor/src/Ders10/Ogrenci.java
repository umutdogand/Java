/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class Ogrenci extends javax.swing.JFrame {

    /**
     * Creates new form Ogrenci
     */
    public Ogrenci() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtTc = new javax.swing.JTextField();
        txtSinif = new javax.swing.JTextField();
        cmbBolum = new javax.swing.JComboBox();
        rbErkek = new javax.swing.JRadioButton();
        rbKadin = new javax.swing.JRadioButton();
        btnEkle = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnSifirla = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGetir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1.setBackground(new java.awt.Color(204, 204, 204));
        pnl1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 208, 200), 2), "Bilgiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Adi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Soyadi");

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Tc");

        jLabel4.setText("Sınıf");

        jLabel5.setText("Bölüm");

        jLabel6.setText("Cinsiyet");

        cmbBolum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bilgisayar M.", "Makina M", "Uçak M.", "Elektirik M.", " " }));

        buttonGroup1.add(rbErkek);
        rbErkek.setText("Erkek");

        buttonGroup1.add(rbKadin);
        rbKadin.setText("Kadın");

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnGuncelle.setText("Güncelle");

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnSifirla.setText("Sıfırla");
        btnSifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSifirlaActionPerformed(evt);
            }
        });

        txtId.setText(" ");
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel7.setText("Id");

        btnGetir.setText("Getir");
        btnGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addComponent(btnEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuncelle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSifirla)
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtTc, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtSoyadi, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtSinif, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(cmbBolum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnGetir))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbErkek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbKadin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        pnl1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAdi, txtSinif, txtSoyadi, txtTc});

        pnl1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEkle, btnGuncelle, btnSifirla, btnSil});

        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGetir))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSinif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbErkek)
                    .addComponent(rbKadin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEkle)
                    .addComponent(btnGuncelle)
                    .addComponent(btnSil)
                    .addComponent(btnSifirla))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        String id = txtId.getText();
        String adi = txtAdi.getText();
        String soyadi = txtSoyadi.getText();
        String tc = txtTc.getText();
        String sinif = txtSinif.getText();
        String bolum = cmbBolum.getSelectedItem().toString();
        String cinsiyet = "";
        if (rbErkek.isSelected()) {
            cinsiyet = "Erkek";
        } else if (rbKadin.isSelected()) {
            cinsiyet = "Kadın";
        } else {
            JOptionPane.showMessageDialog(null, "Cinsiyet Seçmek Zorunludur");
        }
        //"Uptate Ogrenci set adi=..,soyadi=..   where id=.."
        String sorgu = "insert into ogrenci(id,Adi,SoyAdi,Tc,Bolum,Sinif,Cinsiyet)"
                 + " values(" + id + ",\"" + adi + "\",\"" + soyadi + "\",\"" + tc + "\",\"" + bolum + "\",\"" + sinif + "\",\"" + cinsiyet + "\")";
        DB ekle = new DB();
        int kayit = ekle.islemlerFunction(sorgu);
//        String deger=bolum.equals(" ")?"ali":"deger";
        if (kayit == 1) {
            JOptionPane.showMessageDialog(null, "Uyarı", "Kayit Başarlı", 1);
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSifirlaActionPerformed
    }//GEN-LAST:event_btnSifirlaActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        String id = txtId.getText();
        if (id.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Id olmadan Silme İşlemi Yapılamaz", "", 3);
            return;
        }
        String sorgu = "Delete from ogrenci where id=" + id + "";
        DB db = new DB();
        int kayit = db.islemlerFunction(sorgu);
        if (kayit != 0) {
            JOptionPane.showMessageDialog(null, "Silme İşlemi Başarlı");
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetirActionPerformed
        try {
            String id = txtId.getText();
            if (id.equals(" ")) {
                JOptionPane.showMessageDialog(null, "Id olmadan Getirme İşlemi Yapılamaz", "", 3);
                return;
            }
            DB db = new DB();
            
            String sorgu = "Select * from ogrenci where id=" + id + "";
            ResultSet rs = db.selectFunc(sorgu);
            while (rs.next()) {
                txtAdi.setText(rs.getString("Adi"));
                txtSoyadi.setText(rs.getString("SoyAdi"));
                txtSinif.setText(rs.getString("Sinif"));
                txtTc.setText(rs.getString("Tc"));
                if (rs.getString("Tc").equals("Erkek")) {
                    rbErkek.setSelected(true);
                } else if (rs.getString("Tc").equals("Kadın")) {
                    rbKadin.setSelected(true);
                }
                cmbBolum.setSelectedItem(rs.getString("Bolum"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ogrenci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGetirActionPerformed

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
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ogrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ogrenci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGetir;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSifirla;
    private javax.swing.JButton btnSil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbBolum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnl1;
    private javax.swing.JRadioButton rbErkek;
    private javax.swing.JRadioButton rbKadin;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSinif;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTc;
    // End of variables declaration//GEN-END:variables
}

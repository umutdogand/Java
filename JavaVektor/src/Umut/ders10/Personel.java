/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Umut.ders10;

import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vektorel
 */
public class Personel extends javax.swing.JFrame {

    /**
     * Creates new form Personel
     */
    public int Id;
    public String ad;
    public String soyad;
    public String tc;
    public String gorev;
    public String cinsiyet;
    DB dbIslemler;
    public Personel() {
        initComponents();
        dbIslemler=new DB();
        cbgörev.setModel(new DefaultComboBoxModel(dbIslemler.getGorev().values().toArray()));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbladi = new javax.swing.JTextField();
        lblsoyadi = new javax.swing.JTextField();
        lbltc = new javax.swing.JTextField();
        rberkek = new javax.swing.JRadioButton();
        cbgörev = new javax.swing.JComboBox();
        rbkadin = new javax.swing.JRadioButton();
        btnekle = new javax.swing.JButton();
        btnsil = new javax.swing.JButton();
        btngüncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btngetir = new javax.swing.JButton();
        lblmesaj = new javax.swing.JLabel();
        lblhata = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Adı");

        jLabel2.setText("Soyadı");

        jLabel3.setText("TC");

        jLabel4.setText("Görev");

        jLabel6.setText("Cinsiyet");

        lblsoyadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsoyadiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rberkek);
        rberkek.setText("Erkek");
        rberkek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rberkekActionPerformed(evt);
            }
        });

        cbgörev.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rbkadin);
        rbkadin.setText("Kadın");
        rbkadin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbkadinActionPerformed(evt);
            }
        });

        btnekle.setText("Ekle");
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
            }
        });

        btnsil.setText("Sil");
        btnsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsilActionPerformed(evt);
            }
        });

        btngüncelle.setText("Güncelle");
        btngüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngüncelleActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Adi", "Soyad", "Tc", "Görev", "Cinsiyet"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        btngetir.setText("Getir");
        btngetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblsoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbgörev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbladi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(rberkek)
                        .addGap(42, 42, 42)
                        .addComponent(rbkadin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnekle)
                        .addGap(30, 30, 30)
                        .addComponent(btnsil)
                        .addGap(18, 18, 18)
                        .addComponent(btngüncelle)
                        .addGap(18, 18, 18)
                        .addComponent(btngetir)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbgörev, lbladi, lblsoyadi, lbltc});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnekle, btngüncelle, btnsil});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbladi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblsoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbltc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbgörev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rberkek)
                    .addComponent(rbkadin))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnekle)
                    .addComponent(btnsil)
                    .addComponent(btngüncelle)
                    .addComponent(btngetir))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        lblmesaj.setBackground(new java.awt.Color(255, 51, 51));

        lblhata.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhata, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(lblhata, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblmesaj)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rberkekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rberkekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rberkekActionPerformed

    private void rbkadinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbkadinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbkadinActionPerformed

    private void lblsoyadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsoyadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsoyadiActionPerformed

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
       DefaultTableModel model = ( DefaultTableModel) tbl.getModel();
       String ad=lbladi.getText();
       String Soyad=lblsoyadi.getText();
       String Tc=lbltc.getText();
       String gorev=cbgörev.getSelectedItem().toString();
       String cinsiyet = null;
       
       if(rberkek.isSelected()){
           cinsiyet="Erkek";
       }
       else if(rbkadin.isSelected()){
           cinsiyet="Kadın";
       }
       model.addRow(new Object[]{1,ad,Soyad,Tc,gorev,cinsiyet});
       
       
    }//GEN-LAST:event_btnekleActionPerformed

    private void btnsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsilActionPerformed
      DefaultTableModel model = ( DefaultTableModel) tbl.getModel();
        int a = tbl.getSelectedRow();
        if(a!=-1){
            model.removeRow(a);
        
        }else{
            lblhata.setText("Öncelikle Tablodan Kayıt Seçmelisiniz!");
                    
        }
        
        
        
        
    }//GEN-LAST:event_btnsilActionPerformed

    private void btngüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngüncelleActionPerformed
     int guncellenecek=tbl.getSelectedRow();
     tbl.setValueAt("Umut", guncellenecek, 1);
        
        
        
    }//GEN-LAST:event_btngüncelleActionPerformed

    private void btngetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetirActionPerformed
    Map<Integer,Personel> map =new HashMap<Integer,Personel>();
    map=dbIslemler.getPersonel("select * from personel");
    DefaultTableModel modelTablo=(DefaultTableModel) tbl.getModel();
    int count =modelTablo.getRowCount();
        for (int i = 0; i < count; i++) {
            modelTablo.removeRow(i);
            
        }
        for (Personel object  : map.values()) {
            modelTablo.addRow(new Object[]{1,object.ad,object.soyad,object.tc,gorev,cinsiyet});
        }
    
    }//GEN-LAST:event_btngetirActionPerformed

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
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnekle;
    private javax.swing.JButton btngetir;
    private javax.swing.JButton btngüncelle;
    private javax.swing.JButton btnsil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbgörev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbladi;
    private javax.swing.JLabel lblhata;
    private javax.swing.JLabel lblmesaj;
    private javax.swing.JTextField lblsoyadi;
    private javax.swing.JTextField lbltc;
    private javax.swing.JRadioButton rberkek;
    private javax.swing.JRadioButton rbkadin;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}

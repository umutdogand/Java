/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GAMZEders10;

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

    
    DB dbIslemler;
    
    public int id;
    public String ad;
    public String soyad;
    public String tc;
    public String gorev;
    public String cinsiyet;
    
    public Personel() {//ilk çalışan kısım , yapıcı
          
        dbIslemler = new DB();
        initComponents();
        //combobox'ı dolduracağız.
        COMBOX_GÖREV.setModel( new DefaultComboBoxModel(dbIslemler.getGorev().values().toArray()) );//veritabanından çektiğimiz görev tanımlarını uygulamamızda gösteriyoruz. ComboBox'ın içerisini doldurduk.
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        LABEL_SOYAD = new javax.swing.JLabel();
        LABEL_AD = new javax.swing.JLabel();
        LABEL_CİNSİYET = new javax.swing.JLabel();
        LABEL_GÖREV = new javax.swing.JLabel();
        LABEL_TC = new javax.swing.JLabel();
        TEXT_AD = new javax.swing.JTextField();
        TEXT_SOYAD = new javax.swing.JTextField();
        TEXT_TC = new javax.swing.JTextField();
        COMBOX_GÖREV = new javax.swing.JComboBox();
        RBUTTON_KADIN = new javax.swing.JRadioButton();
        RBUTTON_ERKEK = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLE_PERSONEL = new javax.swing.JTable();
        BUTTON_EKLE = new javax.swing.JButton();
        BUTTON_SİL = new javax.swing.JButton();
        BUTTON_GÜNCELLE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LABEL_HATA = new javax.swing.JLabel();
        BUTTON_GETİR = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        LABEL_SOYAD.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LABEL_SOYAD.setText("SOYAD");

        LABEL_AD.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LABEL_AD.setText("AD");

        LABEL_CİNSİYET.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LABEL_CİNSİYET.setText("CİNSİYET");

        LABEL_GÖREV.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LABEL_GÖREV.setText("GÖREV");

        LABEL_TC.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        LABEL_TC.setText("TC");

        COMBOX_GÖREV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOX_GÖREVActionPerformed(evt);
            }
        });

        RBUTTON_KADIN.setBackground(new java.awt.Color(255, 204, 204));
        RBUTTON_KADIN.setText("Kadın");

        RBUTTON_ERKEK.setBackground(new java.awt.Color(255, 204, 204));
        RBUTTON_ERKEK.setText("Erkek");

        TABLE_PERSONEL.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        TABLE_PERSONEL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AD", "SOYAD", "TC", "GÖREV", "CINSIYET"
            }
        ));
        TABLE_PERSONEL.setGridColor(new java.awt.Color(255, 255, 204));
        jScrollPane3.setViewportView(TABLE_PERSONEL);

        BUTTON_EKLE.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BUTTON_EKLE.setText("EKLE");
        BUTTON_EKLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_EKLEActionPerformed(evt);
            }
        });

        BUTTON_SİL.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BUTTON_SİL.setText("SİL");
        BUTTON_SİL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_SİLActionPerformed(evt);
            }
        });

        BUTTON_GÜNCELLE.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BUTTON_GÜNCELLE.setText("GÜNCELLE");
        BUTTON_GÜNCELLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_GÜNCELLEActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));

        LABEL_HATA.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        LABEL_HATA.setForeground(new java.awt.Color(255, 51, 51));

        BUTTON_GETİR.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BUTTON_GETİR.setText("GETİR");
        BUTTON_GETİR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_GETİRActionPerformed(evt);
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
                            .addComponent(LABEL_AD)
                            .addComponent(LABEL_SOYAD)
                            .addComponent(LABEL_TC)
                            .addComponent(LABEL_GÖREV)
                            .addComponent(LABEL_CİNSİYET))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(COMBOX_GÖREV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TEXT_TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TEXT_SOYAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RBUTTON_KADIN, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(RBUTTON_ERKEK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TEXT_AD, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BUTTON_EKLE)
                                .addGap(18, 18, 18)
                                .addComponent(BUTTON_SİL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BUTTON_GÜNCELLE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LABEL_HATA))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(BUTTON_GETİR)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {COMBOX_GÖREV, TEXT_AD, TEXT_SOYAD, TEXT_TC});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BUTTON_EKLE, BUTTON_GÜNCELLE, BUTTON_SİL});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL_AD)
                            .addComponent(TEXT_AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LABEL_SOYAD))
                    .addComponent(TEXT_SOYAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_TC)
                    .addComponent(TEXT_TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_GÖREV)
                    .addComponent(COMBOX_GÖREV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_CİNSİYET)
                    .addComponent(RBUTTON_KADIN)
                    .addComponent(RBUTTON_ERKEK))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTTON_EKLE)
                    .addComponent(BUTTON_SİL)
                    .addComponent(BUTTON_GÜNCELLE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LABEL_HATA))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BUTTON_GETİR)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void COMBOX_GÖREVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOX_GÖREVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOX_GÖREVActionPerformed

    private void BUTTON_GÜNCELLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_GÜNCELLEActionPerformed
        // TODO add your handling code here:
        int guncellenecek = TABLE_PERSONEL.getSelectedRow();
        TABLE_PERSONEL.setValueAt("Gamze", guncellenecek, 1);
    }//GEN-LAST:event_BUTTON_GÜNCELLEActionPerformed

    private void BUTTON_EKLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EKLEActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TABLE_PERSONEL.getModel();
   
        String ad = TEXT_AD.getText();
        String soyad = TEXT_SOYAD.getText();
        String tc = TEXT_TC.getText();
        String gorev = COMBOX_GÖREV.getSelectedItem().toString();
        String cinsiyet = "";
        if( RBUTTON_ERKEK.isSelected() )
        {
            cinsiyet = "Erkek";
        }
        
        else if( RBUTTON_KADIN.isSelected() )
        {
            cinsiyet = "Kadin";
        }
        model.addRow(new Object[]{1,ad,soyad,tc,gorev,cinsiyet});
        
    }//GEN-LAST:event_BUTTON_EKLEActionPerformed

    private void BUTTON_SİLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_SİLActionPerformed
        // TODO add your handling code here:
        LABEL_HATA.setText("");
        DefaultTableModel model = (DefaultTableModel) TABLE_PERSONEL.getModel();
        int a = TABLE_PERSONEL.getSelectedRow();
        if (a != -1)//SEÇİLİ SATIR VARSA
        {
            model.removeRow(a); //tablodan seçili satırı aldık, başta verdiğimiz referanstan sildik.
        }
        else
        {
            LABEL_HATA.setText("TABLODAN BİR KAYIT SEÇİNİZ !");
        }
    }//GEN-LAST:event_BUTTON_SİLActionPerformed

    private void BUTTON_GETİRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_GETİRActionPerformed
        // TODO add your handling code here:
        Map<Integer,Personel> map = new HashMap<Integer,Personel>(); //kjey:Integer, value:Personel
        map = dbIslemler.getPersonel("select * from personel");
        DefaultTableModel modelTablo = (DefaultTableModel) TABLE_PERSONEL.getModel(); //table_personel modelinde bir tablo yarattık.
        
        for (Personel object : map.values())
        {
            modelTablo.addRow(new Object[]{object.id,object.ad,object.soyad,object.tc,object.gorev,object.cinsiyet});
        }
    }//GEN-LAST:event_BUTTON_GETİRActionPerformed

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
    private javax.swing.JButton BUTTON_EKLE;
    private javax.swing.JButton BUTTON_GETİR;
    private javax.swing.JButton BUTTON_GÜNCELLE;
    private javax.swing.JButton BUTTON_SİL;
    private javax.swing.JComboBox COMBOX_GÖREV;
    private javax.swing.JLabel LABEL_AD;
    private javax.swing.JLabel LABEL_CİNSİYET;
    private javax.swing.JLabel LABEL_GÖREV;
    private javax.swing.JLabel LABEL_HATA;
    private javax.swing.JLabel LABEL_SOYAD;
    private javax.swing.JLabel LABEL_TC;
    private javax.swing.JRadioButton RBUTTON_ERKEK;
    private javax.swing.JRadioButton RBUTTON_KADIN;
    private javax.swing.JTable TABLE_PERSONEL;
    private javax.swing.JTextField TEXT_AD;
    private javax.swing.JTextField TEXT_SOYAD;
    private javax.swing.JTextField TEXT_TC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13KutupHane;

/**
 *
 * @author vektorel
 */
public class AnaSayfa extends javax.swing.JFrame {

    /**
     * Creates new form AnaSayfa
     */
    public AnaSayfa() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnPersonel = new javax.swing.JButton();
        btnKitapEkle = new javax.swing.JButton();
        btnRezervasyon = new javax.swing.JButton();
        btnZiyaretci = new javax.swing.JButton();
        btnMasa = new javax.swing.JButton();
        btnOda = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnitemKutuphane = new javax.swing.JMenu();
        itemCikis = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemKitapSorgula = new javax.swing.JMenuItem();
        itemMasaSorgula = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemKitapEkle = new javax.swing.JMenuItem();
        itemKitapListele = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemPersonelEkle = new javax.swing.JMenuItem();
        itemPersonelListele = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        itemZiyaretciEkle = new javax.swing.JMenuItem();
        itemZiyaretciSorgula = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Otomasyonu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnPersonel.setText("Personel");

        btnKitapEkle.setText("Kitap");
        btnKitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKitapEkleActionPerformed(evt);
            }
        });

        btnRezervasyon.setText("Rezervasyon");

        btnZiyaretci.setText("Ziyaretçi");

        btnMasa.setText("Masa");

        btnOda.setText("Oda");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Adı", "Yazarı", "Raf No", "Kitap Kodu", "Yayın Tarihi", "Baskı", "Arama Sayısı"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnZiyaretci)
                            .addComponent(btnMasa)
                            .addComponent(btnOda))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPersonel)
                                    .addComponent(btnRezervasyon))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKitapEkle)
                                .addGap(548, 548, 548)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnKitapEkle, btnMasa, btnOda, btnPersonel, btnRezervasyon, btnZiyaretci});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnKitapEkle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPersonel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRezervasyon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZiyaretci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mnitemKutuphane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/books_1.png"))); // NOI18N
        mnitemKutuphane.setText("Kütüphane");

        itemCikis.setText("Çıkış");
        itemCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCikisActionPerformed(evt);
            }
        });
        mnitemKutuphane.add(itemCikis);

        jMenuItem3.setText("Yönetim Paneli");
        mnitemKutuphane.add(jMenuItem3);

        jMenuBar1.add(mnitemKutuphane);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        jMenu2.setText("Sorgulamalar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        itemKitapSorgula.setText("Kitap Sorgula");
        itemKitapSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKitapSorgulaActionPerformed(evt);
            }
        });
        jMenu2.add(itemKitapSorgula);

        itemMasaSorgula.setText("Masa Sorgulama");
        itemMasaSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMasaSorgulaActionPerformed(evt);
            }
        });
        jMenu2.add(itemMasaSorgula);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/books2.png"))); // NOI18N
        jMenu3.setText("Kitap İşlemleri");

        itemKitapEkle.setText("Kitap Ekle");
        itemKitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKitapEkleActionPerformed(evt);
            }
        });
        jMenu3.add(itemKitapEkle);

        itemKitapListele.setText("Kitap Listele");
        itemKitapListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKitapListeleActionPerformed(evt);
            }
        });
        jMenu3.add(itemKitapListele);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Users.png"))); // NOI18N
        jMenu4.setText("Personel İşlemleri");

        itemPersonelEkle.setText("Personel Ekle");
        itemPersonelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPersonelEkleActionPerformed(evt);
            }
        });
        jMenu4.add(itemPersonelEkle);

        itemPersonelListele.setText("Personel Listele");
        itemPersonelListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPersonelListeleActionPerformed(evt);
            }
        });
        jMenu4.add(itemPersonelListele);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rezervasyon.png"))); // NOI18N
        jMenu5.setText("Rezervasyon İşlemleri");

        jMenuItem10.setText("Masa Rezervasyonu");
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Kitap Rezervasyonu");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Oda Rezervasyonu");
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book.png"))); // NOI18N
        jMenu7.setText("Ziyaretçi Defteri");

        itemZiyaretciEkle.setText("Ziyaretçi Ekle");
        itemZiyaretciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemZiyaretciEkleActionPerformed(evt);
            }
        });
        jMenu7.add(itemZiyaretciEkle);

        itemZiyaretciSorgula.setText("Ziyaret Sorgula");
        itemZiyaretciSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemZiyaretciSorgulaActionPerformed(evt);
            }
        });
        jMenu7.add(itemZiyaretciSorgula);

        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help.png"))); // NOI18N
        jMenu6.setText("Yardım");

        jMenuItem13.setText("Hakkında");
        jMenu6.add(jMenuItem13);

        jMenuItem14.setText("İletişim");
        jMenu6.add(jMenuItem14);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemKitapSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKitapSorgulaActionPerformed
        KitapSorgula kitap = new KitapSorgula();
        kitap.setVisible(true);
    }//GEN-LAST:event_itemKitapSorgulaActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void itemCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemCikisActionPerformed

    private void itemPersonelListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPersonelListeleActionPerformed
        PersonelListele personel = new PersonelListele();
        personel.setVisible(true);
    }//GEN-LAST:event_itemPersonelListeleActionPerformed

    private void itemPersonelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPersonelEkleActionPerformed
        PersonelEkle personel = new PersonelEkle();
        personel.setVisible(true);
    }//GEN-LAST:event_itemPersonelEkleActionPerformed

    private void btnKitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKitapEkleActionPerformed
        KitapEkle kitap = new KitapEkle();
        kitap.setVisible(true);
    }//GEN-LAST:event_btnKitapEkleActionPerformed

    private void itemMasaSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMasaSorgulaActionPerformed
        MasaSorgulama masa = new MasaSorgulama();
        masa.setVisible(true);
    }//GEN-LAST:event_itemMasaSorgulaActionPerformed

    private void itemZiyaretciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemZiyaretciEkleActionPerformed
        ZiyaretEkle ziyaret = new ZiyaretEkle();
        ziyaret.setVisible(true);
    }//GEN-LAST:event_itemZiyaretciEkleActionPerformed

    private void itemZiyaretciSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemZiyaretciSorgulaActionPerformed
        ZiyaretciListele ziyaret = new ZiyaretciListele();
        ziyaret.setVisible(true);
    }//GEN-LAST:event_itemZiyaretciSorgulaActionPerformed

    private void itemKitapListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKitapListeleActionPerformed
        KitapSorgula kitap = new KitapSorgula();
        kitap.setVisible(true);
    }//GEN-LAST:event_itemKitapListeleActionPerformed

    private void itemKitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKitapEkleActionPerformed
        KitapEkle kitap = new KitapEkle();
        kitap.setVisible(true);
    }//GEN-LAST:event_itemKitapEkleActionPerformed

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
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKitapEkle;
    private javax.swing.JButton btnMasa;
    private javax.swing.JButton btnOda;
    private javax.swing.JButton btnPersonel;
    private javax.swing.JButton btnRezervasyon;
    private javax.swing.JButton btnZiyaretci;
    private javax.swing.JMenuItem itemCikis;
    private javax.swing.JMenuItem itemKitapEkle;
    private javax.swing.JMenuItem itemKitapListele;
    private javax.swing.JMenuItem itemKitapSorgula;
    private javax.swing.JMenuItem itemMasaSorgula;
    private javax.swing.JMenuItem itemPersonelEkle;
    private javax.swing.JMenuItem itemPersonelListele;
    private javax.swing.JMenuItem itemZiyaretciEkle;
    private javax.swing.JMenuItem itemZiyaretciSorgula;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu mnitemKutuphane;
    // End of variables declaration//GEN-END:variables
}

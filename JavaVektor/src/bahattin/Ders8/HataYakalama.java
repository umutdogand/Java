/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahattin.Ders8;

import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class HataYakalama {
static int carpim=1;
static int toplam=0;
    public static void main(String[] args) {
        rekursifFonk(20);
  //      System.out.println(carpim);
        System.out.println(toplam);
    }

    private static void rekursifFonk(int sayi) {  //Kendini Çağıran Fonksiyon
//        if(sayi==1)
//            return;
//        carpim=carpim*sayi;
//        rekursifFonk(sayi-1);
        if (sayi==0)
            return;
        toplam=toplam+sayi;
        rekursifFonk(sayi+1);
    }

    private void HataYakalama() {
        int a = Integer.valueOf("12");
        try {
            int b = Integer.valueOf("D");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.toString());
            return;
        } finally {
            System.out.println("Bitti");
        }
        System.out.println("Deneme");
    }


}

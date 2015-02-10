/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavektor;

import java.util.Random;

public class Ders4 {

    public String adi = "ahmet";
    public String soyAdi;
    public int yas;

    public void randomIslemler() {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
        int gelenDeger = 5+rd.nextInt(10);
            System.out.println(gelenDeger);            
        }
        double gelenDobule=rd.nextDouble()*9+1;
        System.out.println(gelenDobule);
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            yas = yas * (-1);
        }
        this.yas = yas;
    }

    public Ders4() {

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public Ders4(String ad, String soyad) {
        this.adi = ad;
        this.soyAdi = soyad;
    }

    public void yazdir() {
        System.out.println(adi + soyAdi);
    }

    public void cokBoyutluDiziler() {
        int[][] diziAraba = new int[4][3];
        diziAraba[0][0] = 50;
        diziAraba[0][1] = 150;
        diziAraba[0][2] = 10;
        diziAraba[1][0] = 60;
        diziAraba[1][1] = 30;
        diziAraba[1][2] = 25;
        diziAraba[2][0] = 100;
        diziAraba[2][1] = 40;
        diziAraba[2][2] = 15;
        diziAraba[3][0] = 5;
        diziAraba[3][1] = 125;
        diziAraba[3][2] = 17;
        int eb = 0;
        for (int i = 0; i < diziAraba.length; i++) {
            for (int j = 0; j < diziAraba[0].length; j++) {
                if (eb > diziAraba[i][j]) {
                    eb = diziAraba[i][j];
                }
            }
        }

        System.out.println(eb);
    }
}

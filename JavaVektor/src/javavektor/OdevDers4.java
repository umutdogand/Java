package javavektor;

import java.util.Random;

public class OdevDers4 {

    public void ebekRandom() {
        int[][] diziSayi = new int[3][3];
        double[][] diziOndalik = new double[5][5];
        Random rd = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                diziSayi[i][j] = 50 + rd.nextInt(950);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                diziOndalik[i][j] = 50 + rd.nextDouble() * 950;
            }
        }
        int ebS = ebSayiHesapla(diziSayi);
        int ekS = ekSayiHesapla(diziSayi);
        double ebD = ebSayiHesapla(diziOndalik);
        double ekD = ekSayiHesapla(diziOndalik);
        
        if(ebD>ebS)
            System.out.println("En Büyük sayi :"+ebD);
        else if(ebD<ebS)
            System.out.println("En Büyük sayi :"+ebS);
        
        if(ekD>ekS)
            System.out.println("En Küçük sayi :"+ekS);
        else if(ekD<ekS)
            System.out.println("En Küçük sayi :"+ekD);
        
        
    }

    public int ebSayiHesapla(int[][] dizi) {
        int eb = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] > eb) {
                    eb = dizi[i][j];
                }
            }
        }
        return eb;
    }

    public int ekSayiHesapla(int[][] dizi) {

        int ek = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] < ek) {
                    ek = dizi[i][j];
                }
            }
        }
        return ek;
    }
    
    public double ebSayiHesapla(double[][] dizi) {
        double eb = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] > eb) {
                    eb = dizi[i][j];
                }
            }
        }
        return eb;
    }

    public double ekSayiHesapla(double[][] dizi) {

        double ek = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] < ek) {
                    ek = dizi[i][j];
                }
            }
        }
        return ek;
    }
    
}

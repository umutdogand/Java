package Umut;

import java.util.Random;
import java.util.Scanner;

public class Ödev33 {

    public void ebekÖdev() {
        int dizint[][] = new int[3][3];
        double dizido[][] = new double[5][5];
        Random rd = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dizint[i][j] = 50 + rd.nextInt(950);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dizido[i][j] = 50 + rd.nextDouble() * 950;

            }

        }

        int ebS = ebsayiH(dizint);
        int ekS = eksayiH(dizint);
        double ebD = ebsayiH(dizido);
        double ekD = eksayiH(dizido);

        if (ebD > ebS) {
            System.out.println("En Büyük sayi :" + ebD);
        } else if (ebD < ebS) {
            System.out.println("En Büyük sayi :" + ebS);
        }

        if (ekD > ekS) {
            System.out.println("En Küçük sayi :" + ekS);
        } else if (ekD < ekS) {
            System.out.println("En Küçük sayi :" + ekD);
        }
    }

    public int ebsayiH(int dizi[][]) {
        int eb = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] > eb) {
                    dizi[i][j] = eb;
                }

            }

        }
        return eb;
    }

    public int eksayiH(int dizi[][]) {
        int ek = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] < ek) {
                    dizi[i][j] = ek;
                }

            }

        }
        return ek;
    }

    public double ebsayiH(double dizi[][]) {
        double ebd = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] > ebd) {
                    dizi[i][j] = ebd;
                }

            }

        }
        return ebd;
    }

    public double eksayiH(double dizi[][]) {
        double ek = dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] > ek) {
                    dizi[i][j] = ek;
                }

            }
        }
        return ek;
    }

    public void SayiBulma() {
        Random rd = new Random();
        int sayi = 1 + rd.nextInt(9);
        int girilensayi;
        Scanner scan = new Scanner(System.in);
        int kullanılanhak = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Lütfen Bir Sayı Giriniz: ");
            girilensayi = scan.nextInt();
            if (girilensayi == sayi) {
                System.out.println("Tebrikler Sayıyı Buldunuz");
                break;
            }
            if (girilensayi < sayi) {
                System.out.println("Lütfen daha büyük bir değer giriniz");
            }
            if (girilensayi > sayi) {
                System.out.println("Lütfen daha küçük bir değer giriniz");
            }
            kullanılanhak++;
        }
        if (kullanılanhak == 5) {
            System.out.println("Maalesef sayıyı bulamadınız :( ");
        }
    }
}

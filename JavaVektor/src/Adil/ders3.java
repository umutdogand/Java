package Adil;

import java.util.Scanner;

public class ders3 {

    public void Breakislem() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 7) {
                break;
            }
        }
    }

    public void SwitchD() {
        Scanner sayi = new Scanner(System.in);
        int girilensayi = sayi.nextInt();
        switch (girilensayi) {
            case 1:
                System.out.println("");
                break;

            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            default:
        }

    }

    public void stringislemleri() {
//            String isim="umutdogan";
//            char harf=isim.charAt(5);
//            System.out.println("harf");
        Scanner sayi = new Scanner(System.in);
        String onluk = sayi.nextLine();
        char onlar = onluk.charAt(0);
        char birler = onluk.charAt(1);

        String on = onlarH(onlar);
        String bir = birlerH(birler);

        System.out.println(on + bir);

    }

    public String onlarH(char onlar) {
        switch (onlar) {
            case '1':
                return "on";
            case '2':
                return "yirmi";
            case '3':
                return "otuz";
            case '4':
                return "kırk";
            case '5':
                return "elli";
            case '6':
                return "altmıs";
            case '7':
                return "yetmis";
            case '8':
                return "sekzen";
            case '9':
                return "doksan";
            default:
                return "";

        }
    }

    public String birlerH(char birler) {
        switch (birler) {

            case '1':
                return "bir";
            case '2':
                return "iki";
            case '3':
                return "uc";
            case '4':
                return "dort";
            case '5':
                return "bes";
            case '6':
                return "altı";
            case '7':
                return "yedi";
            case '8':
                return "sekiz";
            case '9':
                return "dokuz";
            default:
                return "";
        }

    }

    public void dizi() {
//        int[] dizi;
//        System.out.println("Kaç Eleman Gieceksiniz :");
//        Scanner scan = new Scanner(System.in);
//        int toplam=0;
//        int deger = scan.nextInt();
//        dizi = new int[deger];
//        for (int i = 0; i < dizi.length; i++) {
//            System.out.println("sayı g,r,n,z");
//            dizi[i]=scan.nextInt();
//            
//            toplam = toplam+dizi[i];
//            
//        }
//        System.out.println(toplam);
        int[] dizi=new int[6];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
           System.out.println("sayı giriniz");
           dizi[i]=scan.nextInt();
            
        }
        System.out.println(dizi[5]+dizi[4]+dizi[3]+dizi[2]+dizi[1]+dizi[0]);
    }
}

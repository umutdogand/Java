/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavektor;

import java.util.Scanner;

/**
 *
 * @author vektorel
 */
public class Ders3 {

    public void breakIslem() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ilk");
            if (i == 7) {
                continue;
            }
            System.out.println("son");

        }

    }

    public void switchIslemleri() {
        Scanner scan = new Scanner(System.in);
        int girilenSayi = scan.nextInt();
        switch (girilenSayi) {
            case 1:
                System.out.println("Girilen Sayi Bir");
                break;
            case 2:
                System.out.println("Girilen Sayi İki");
                break;
            case 3:
                System.out.println("Girilen Sayi Üç");
                break;
            case 4:
                System.out.println("Girilen Sayi Dört");
                break;
            case 5:
                System.out.println("Mükemmel");
                System.out.println("Girilen Sayi Beş");
                break;
            case 6:
                System.out.println("Girilen Sayi Altı");
                break;
            case 7:
                System.out.println("Girilen Sayi Yedi");
                break;
            case 8:
                System.out.println("Girilen Sayi Sekiz");
                break;
            case 9:
                System.out.println("Girilen Sayi Dokuz");
                break;
            default:
                System.out.println("Girilen Sayi Tanımlı Değil");
                break;
        }
    }

    public void stringIslemleri() {

        String islemler = "UmutDogan";
        char harf = islemler.charAt(5);
        System.out.println(harf);

    }

    public void basamaklarinaAyirma() {
        System.out.println("Lütfen Bİr Sayi Giriniz :");
        Scanner sayi = new Scanner(System.in);
        String girilenDeger = sayi.nextLine();

        char onluk = girilenDeger.charAt(0);
        char birler = girilenDeger.charAt(1);

        String on = onlarHesapla(onluk);
        String bir = birlerHesapla(birler);

        System.out.println(on + bir);
    }

    //onlar=5
    public String onlarHesapla(char onlar) {
        switch (onlar) {
            case '1':
                return "On";
            case '2':
                return "Yirmi";
            case '3':
                return "Otuz";
            case '4':
                return "Kırk";
            case '5':
                return "Elli";
            case '6':
                return "Atmış";
            case '7':
                return "Yetmiş";
            case '8':
                return "Seksen";
            case '9':
                return "Doksan";
        }
        return "";
    }

    //birlik=birler
    public String birlerHesapla(char birlik) {
        switch (birlik) {
            case '1':
                return "Bir";
            case '2':
                return "İki";
            case '3':
                return "Üç";
            case '4':
                return "Dört";
            case '5':
                return "Beş";
            case '6':
                return "Altı";
            case '7':
                return "Yedi";
            case '8':
                return "Sekiz";
            case '9':
                return "Dokuz";
            default:
                return "";
        }
    }

    public void islemler() {
        System.out.println("Kaç Tane Sayi Gireceksiniz :");
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=scan.nextInt();
        int [] sayiDizisi=new  int[sayi];
        for (int i = 0; i < sayiDizisi.length; i++) {
            System.out.println("Sayi Giriniz :");
            sayiDizisi[i]=scan.nextInt();
            toplam=toplam+sayiDizisi[i];
        }
        
        System.out.println("Girilen Sayiların Toplamı :" +toplam+"  ve girilen 5. sayi="+sayiDizisi[4]);
        
//        int [] dizi;
//        dizi=new int[6];
//        
//        Scanner scan=new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Lütfem Bir Sayi Giriniz :");
//        //    dizi[i]=scan.nextInt();
//                    
//        }
//        for (int i = 0; i < 5; i++) {
//          //  System.out.println(dizi[i]);
//        }
//
//        String [] adDizi=new String[6];
//        String  adDizi1 []=new String[6];
//        int [] intDizi=new int[6];
//        //String [] adDizi3={"Umut","Adil","Umut","Bahattin","Nuri"};
//        
//        String ad = "umutzadilzumuttzbahattinznuri";
//        String[] dizi1 = ad.split("z");
//        for (int i = 0; i < dizi1.length; i++) {
//            System.out.println(dizi1[i]);//dizi[0],dizi[1] 
//        }

    }
}

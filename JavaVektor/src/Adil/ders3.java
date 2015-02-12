package Adil;

import java.util.Scanner;
import java.util.Random;

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
    
    public void Odev1(){
        Scanner scan= new Scanner(System.in);
        String sayi=scan.nextLine();
        char yuzler=sayi.charAt(0);
        char onlar=sayi.charAt(1);
        char birler=sayi.charAt(2);
        
        String a=yuzluk(yuzler);
        String b=onluk(onlar);
        String c=birlik(birler);
        System.out.println(a + b + c);

    }
    public String yuzluk(char yuzler){
        switch (yuzler) {
           case '1':
                return "yuz";
            case '2':
                return "ikiyuz";
            case '3':
                return "uçyuz";
            case '4':
                return "dortyuz";
            case '5':
                return "besyuz";
            case '6':
                return "altıyuz";
            case '7':
                return "yediyuz";
            case '8':
                return "sekizyuz";
            case '9':
                return "dokuzyuz";
            default:
                return ""; 

        }
        
    }
    public String onluk(char onlar){
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
    public String birlik(char birler){
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
    
    public void TahminOyunu(){
        Random rd= new Random();
        int sayi=rd.nextInt(99)+1;
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        
        int i=1;
        int tahmin;
        do{
            
            tahmin=scan.nextInt();
            if(tahmin<sayi)
                System.out.println("daha büyk sayı giriniz");
            else if(tahmin>sayi)
                System.out.println("daha küçük bir sayı giriniz");
            else{
                System.out.println("tebrikler kazandınız");
            break;
            }
            i++;
        }while(i<=5);
        if(i>5)
            System.out.println("5 kerede bulamadız");
    
    }
    
    
}

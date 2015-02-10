/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahattin;

import java.util.Scanner;

/**
 *
 * @author vektorel
 */
public class ders3 {

    public void breakislem() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 7) {
                break;
            }
        }

    }

    public void switchislemleri() {
        Scanner scan = new Scanner(System.in);
        int girilensayi = scan.nextInt();
        switch (girilensayi) {
            case 1:
                System.out.println("Girilensayı 1");
                break;
            case 2:
                System.out.println("Girilensayı 2");
                break;
            case 3:
                System.out.println("Girilensayı 3");
                break;
            case 4:
                System.out.println("Girilensayı 4");
                break;
            case 5:
                System.out.println("Girilensayı 5");
                break;
            case 6:
                System.out.println("Girilensayı 6");
                break;
            case 7:
                System.out.println("Girilensayı 7");
                break;
            case 8:
                System.out.println("Girilensayı 8");
                break;
            case 9:
                System.out.println("Girilensayı 9");
                break;
            default:
                System.out.println("Girilen sayi tanımsız");
                break;

        }
    }

    public void stringislemleri() {
        /*  String islemler ="bahaddin";
         char harf = islemler.charAt(5);
       
         System.out.println(harf);*/

    }

    public void basamaklarinaayirma() {
        System.out.println("Lütfen bir sayı giriniz");
        Scanner sayi = new Scanner(System.in);
        String girilenDeger = sayi.nextLine();
        char onluk = girilenDeger.charAt(0);
        char birlik = girilenDeger.charAt(1);
        String on = onlarHesapla(onluk);
        String bir = birlerHesapla(birlik);
        System.out.println(on + bir);

    }

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
                return "Altmış";
            case '7':
                return "Yetmiş";
            case '8':
                return "Seksen";
            case '9':
                return "Doksan";
            default:
                return "";

        }
    }

    public String birlerHesapla(char birler) {
        switch (birler) {
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
                return "6";
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
        /*      System.out.println("Kaç sayi girmek istiyorsunuz:");
         Scanner scan = new Scanner(System.in);
         int toplam=0;
         int sayi=scan.nextInt();
         int[] sayiDizisi=new int[sayi];
        
         for (int i = 0; i <sayiDizisi.length ; i++) {
         System.out.println("Bir sayı giriniz:");
         sayiDizisi[i]=scan.nextInt();
         toplam=toplam+sayiDizisi[i];
        
         }*/
        int[] dizi = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Bir sayi giriniz :");
            dizi[i] = scan.nextInt();

        }
        System.out.println("Tersten:" + "\n" + dizi[4] + "\n" + dizi[3] + "\n" + dizi[2] + "\n" + dizi[1] + "\n" + dizi[0]);
    }

    public String odevbirler(char birler) {
        switch (birler) {
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
                return "6";
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

    public String odevonlar(char onlar) {
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
                return "Altmış";
            case '7':
                return "Yetmiş";
            case '8':
                return "Seksen";
            case '9':
                return "Doksan";
            default:
                return "";
        }
    }
    
    public String odevyuzler(char yuzler){
    switch(yuzler){
           case'1':
              return"Yüz";
               
          case'2':
              return "İkiyüz";
              
              case'3':
              return "Üçyüz";
                  
               case'4':
              return "Dörtyüz";
                   
               case'5':
              return "Beşyüz";
                   
                 case'6':
              return "Altıyüz";
                     
                 case'7':
              return "Yediyüz";
                     
                     case'8':
              return "Sekizyüz";
                         
                         case'9':
              return "Dokuzyüz";
                             
              default:
              
       return "";
    }
}
    
    public void odevbasamaklarinaayirma(){
        
        System.out.println("Lütfen Üç Basamaklı Bir Sayı Giriniz: ");
        Scanner scan = new Scanner(System.in);
        String sayi=scan.nextLine();
        char birler=sayi.charAt(2);
        char onlar=sayi.charAt(1);
        char yuzler=sayi.charAt(0);
        
        String birlik= odevbirler(birler);
        String onluk=odevonlar(onlar);
        String yuzluk=odevyuzler(yuzler);
        
        System.out.println(yuzluk + " " + onluk+ " " +birlik);
    }}

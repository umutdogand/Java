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
                    return"";
                

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
                return"";
        }

    }
}

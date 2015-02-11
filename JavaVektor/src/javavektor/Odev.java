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
public class Odev {

    public void ebekBul() {
        System.out.println("Kaç Sayi Gireceksiniz :");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();

        int[] diziSayi = new int[sayi];
        System.out.println("Lütfen Bir Sayi Giriniz :");    
        diziSayi[0] = sc.nextInt();
        int eb = diziSayi[0];
        int ek = diziSayi[0];
        for (int i = 1; i < diziSayi.length; i++) {
            System.out.println("Lütfen Bir Sayi Giriniz :");
            diziSayi[i] = sc.nextInt();
            if (diziSayi[i] > eb) {
                eb = diziSayi[i];
            } else if (diziSayi[i] < ek) {
                ek = diziSayi[i];
            }

        }
        System.out.println("Girdiğiniz En Büyük Sayi :"+eb+" \n Girdiğiniz En Küçük Sayi"+ek+"");
    }

}

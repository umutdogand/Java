/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahattin.Ders7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author vektorel
 */
public class Koleksiyonlar {

    public void arraylistislemleri() {
        List<String> arraylist = new ArrayList<>();
        List<String> arraylist1 = new ArrayList<>();
        arraylist.add("Umut");
        arraylist.add("Adil");
        arraylist.add("Bahattin");
        arraylist.add("Nuri");
        arraylist.add("Umut");
        for (String item : arraylist) {
            System.out.println(item);
        }
        arraylist.remove("Umut");
        System.out.println("-----");
        arraylist1.addAll(arraylist);
        for (String item : arraylist1) {
            System.out.println(item);
        }

        /*    for (Integer item : arraylist) {
         System.out.println("Lütfen bir sayi giriniz: ");
         Scanner scan = new Scanner(System.in);
            
         int girilensayi = scan.nextInt();
         arraylist.add(girilensayi, item);
         System.out.println(girilensayi);
         System.out.println("---");
            
         */
    }

    public void hashsetislemleri() {
        String[] dizi = {"Umut", "Adil", "Bahattin", "Nuri", "Umut"};
        Set<String> hashset = new HashSet<String>();
        for (String dizi1 : dizi) {
            if (!hashset.add(dizi1)) {
                System.out.println(dizi1 + "Aynısı var");
            }
        }
        hashset.remove("Nuri");
        for (String string : hashset) {
            System.out.println(string);
        }

        Set<Integer> sayilar = new HashSet<Integer>();
        System.out.println("Lütfen bir sayi giriniz:");
        Scanner scan = new Scanner(System.in);
        int deger;
        while (true) {
            deger = scan.nextInt();
            if (!sayilar.add(deger)) {
                System.out.println("Aynı Sayi Var");
                break;
            }
        }
    }

    public void mapislemleri() {
        HashMap<Integer, String> hashmap = new HashMap<Integer , String>();
        hashmap.put(124, "Adil");
        hashmap.put(123, "Bahattin");
        hashmap.put(122, "Nuri");
        hashmap.put(121, "Umut");
        
        Set<Integer> st = hashmap.keySet();
        for (Integer i : st) {
            System.out.println(hashmap.get(i));
        }
        System.out.println(hashmap.size());
        HashMap<Integer, String> hashmap1 = new HashMap<Integer , String>();
        
        
    }
}

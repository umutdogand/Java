package Ders7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Koleksiyonlar {

    public void ArrayListIslemleri() {

        List<String> arraylist = new ArrayList<String>();
        List<String> arraylist1 = new ArrayList<String>();
//        List<Integer> sayilist1 = new ArrayList<Integer>();
//        
//        for (int i = 0; i < 20; i++) {
//            sayilist1.add(4*i+23);
//        }

        arraylist.add("Umut");
        arraylist.add("Adil");
        arraylist.add("Bahattin");
        arraylist.add("Nuri");
        arraylist.add("Umut");

        arraylist.remove("Umut");
        System.out.println("-------------");
        arraylist1.addAll(arraylist);
        for (String item : arraylist) {
            System.out.println(item);
        }
        System.out.println(arraylist.get(2));

        System.out.println("-------------");
        arraylist.set(2, "Gamze");
        for (String item : arraylist) {
            System.out.println(item);
        }

        Collections.sort(arraylist);
//        for (Integer i : sayilist1) {
//            System.out.print(i+"--");
//        }
//        System.out.println("****"+Collections.binarySearch(sayilist1, 51));

    }

    public void HashSetIslemleri() {
//        String[] dizi = {"Umut", "Adil", "Bahattin", "Nuri", "Umut"};
//        Set<String> hashSet = new HashSet<String>();
//        for (String item : dizi) {
//            if (!hashSet.add(item)) {
//                System.out.println(item + " Aynısı Var");
//            }
//        }
//        hashSet.remove("Nuri");
//        for (String string : hashSet) {
//            System.out.println(string);
//        }
        HashSet<Integer> hs = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        int deger;
        while (true) {
            deger = sc.nextInt();
            if (!hs.add(deger)) {
                System.out.println(deger + " Degerinden Hashset İçerisinde Var");
                break;
            }
        }

//        Set<Ogrenci> hs1=new HashSet<Ogrenci>();
//        Ogrenci o1=new Ogrenci();
//        o1.ad="adil";
//        o1.soyAd="xxx";
//        o1.no=1111;
//        Ogrenci o2=new Ogrenci("Bahattin","yyy",1211);
//        Ogrenci o3=new Ogrenci("Nuri","zzz",1311);
//        Ogrenci o4=new Ogrenci("Umut","ttt",1411);
//        Ogrenci o5=new Ogrenci("Umut","ttt",1411);
//        
//        hs1.add(o1);
//        hs1.add(o2);
//        hs1.add(o3);
//        hs1.add(o4);
//        hs1.add(o5);
//        for (Ogrenci o : hs1) {
//            System.out.println(o.ad+"--"+o.soyAd+"--"+o.no);
//        }
    }

    public void MapIslemleri() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(124, "Adil");
        hashMap.put(123, "Bahattin");
        hashMap.put(122, "Nuri");
        hashMap.put(121, "Umut");

        Set<Integer> st = hashMap.keySet();
        for (Integer i : st) {
            System.out.println(hashMap.get(i));
        }
        System.out.println(hashMap.size());
    }

    public void KurukIslemleri() {
        Queue<Integer> kuyruk = new LinkedList<Integer>();
        kuyruk.offer(1);
        kuyruk.offer(2);
        kuyruk.offer(3);
        kuyruk.offer(4);
        kuyruk.offer(5);
        
        
//        kuyruk.remove(3);
//        kuyruk.poll();
        System.out.println(kuyruk.peek());
        for (Integer integer : kuyruk) {
            System.out.println(integer);
        }
        
      
    }
}

package Adil.ders7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Koleksiyonlar {

    public void Arraylisstis() {
        List<String> al = new ArrayList<>();
        List<String> al1 = new ArrayList<>();
        al.add("umut");
        al.add("adil");
        al.add("bahatin");
        for (String item : al) {
            System.out.println(item);
        }
        al.remove("umut");
        System.out.println("-------");
        al1.addAll(al);
        for (String item : al1) {
            System.out.println(item);

        }

    }

    public void hashsetislemler() {
//        String [] dizi= {"umut","adil","bahatin","nuri"};
//        Set<String> hashSet = new HashSet<String>();
//        for (int i = 0; i < dizi.length; i++) {
//            if(!hashSet.add(dizi[i]))
//                System.out.println(dizi[i]);
//        }
//        hashSet.remove("nuri");
//        for (String string : hashSet) {
//            System.out.println(string);
//        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        Set<Integer> hashSet = new HashSet<Integer>();
        int deger;
        while (true) {
        deger=scan.nextInt();
        
            if (!hashSet.add(deger)) {
                break;

            }
            
        }

    }
    
    public void hasMap(){
//        HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
//        hashMap.put(123, "adil");
//        hashMap.put(124, "umut");
//        hashMap.put(125, "bahatin");
//        Set<Integer> at= hashMap.keySet();
//        for (Integer i : at) {
//            System.out.println(hashMap.get(i));
//        }
        Queue<Integer> kuyruk= new LinkedList<Integer>();
        kuyruk.offer(1);
        kuyruk.offer(2);
        kuyruk.offer(5);
        kuyruk.offer(9);
        kuyruk.poll();
        for (Integer i : kuyruk) {
            System.out.println(i);
        }
        
    }
}

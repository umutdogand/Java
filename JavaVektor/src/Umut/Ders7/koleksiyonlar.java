
package Umut.Ders7;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class koleksiyonlar {
    List<String> arraylist = new ArrayList<String>();
    List<String> arraylista = new ArrayList<String> ();
    
     
    public void koleksiyon(){
      arraylist.add("umut");
      arraylist.add("adil");
      arraylist.add("bahattin");
      arraylist.add("nuri");
      arraylist.add("umut");
      
        for(String item : arraylist){
            System.out.println(item);
        }
//            arraylist.remove("umut");
//            System.out.println("---------");
//            
//            arraylista.addAll(arraylist);
//        
      
      
    }
    
    
    public void example(){
        List<Integer> arraylistb = new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.print("Lütfen Bir Sayı Giriniz: ");
            int num =scan.nextInt();
            arraylistb.add(num);
        }
        
        
        
        
               
    }
    
    
    public void Hashex(){
        Set<Integer> hashSet = new HashSet<Integer>();
    
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print("Lütfen Bir Sayı Giriniz: ");
            int num1 =scan.nextInt();
            
            if(!hashSet.add(num1)){
                System.out.println(num1+" Aynı Sayı var!!");
            break;
            
            }
        }
        
    

        
    }
    
    public void HashMapex(){
        HashMap<Integer,String> hm =new HashMap<Integer,String>();
         hm.put(120, "Ali");
         hm.put(121, "Ayşe");
         hm.put(122, "Veli");
         hm.put(123, "Ahmet");
         hm.put(124, "Mehmet");
         
         Set<Integer> st = hm.keySet();
         for (Integer i : st) {
             System.out.println(hm.get(i));
            
        }
                
    }
    
    
    
}

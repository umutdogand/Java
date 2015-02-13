/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bahattin;

import java.util.Random;
import java.util.*;

/**
 *
 * @author vektorel
 */
public class Ders5 {
    String tur;
    String cins;
    double agrilik;
    int yas;
    static double toplamagirlik;
    static final int gelenDeger=5;
    
    public Ders5(){
    toplamagirlik=toplamagirlik+this.agrilik;
    }

    public Ders5(String tur, String cins, double agrilik, int yas) {
        this.tur = tur;
        this.cins = cins;
        this.agrilik = agrilik;
        this.yas = yas;
        toplamagirlik=toplamagirlik+agrilik;
        
    }

  public void toplam(){
      System.out.println(toplamagirlik);
  
  }
   
    public void yazdir(){
        System.out.println("Hayvan Cinsi :"+this.cins+"  türü:"+this.tur+"   agirlik:"+this.agrilik+"  Yas"+this.yas);
    }
    public void yazdir(String cins,String tur, double agrilik, int yas){
        System.out.println("Hayvan Cinsi :"+cins+"  türü:"+tur+"   agirlik:"+agrilik+"  Yas"+yas);
    }
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public double getAgrilik() {
        return agrilik;
    }

    public void setAgrilik(double agrilik) {
        this.agrilik = agrilik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    
    public void sayibulma(){
         Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        int gelenDeger = 5+rd.nextInt(5);
            System.out.println(gelenDeger);
        for (int i = 0; i < 5; i++) {
        
            System.out.println("Lütfen bir sayi girin");
            
            int sayi =scan.nextInt();
            if(gelenDeger==sayi){
                System.out.println("Tebrikler");
                break;
            
            }else if (gelenDeger<sayi){
                System.out.println("Lütfen daha küçük sayı giriniz");
                
            }
            else if (gelenDeger>sayi) {
                System.out.println("Lütfen daha büyük sayı giriniz");
                
            }
            

    }
        
    
    }
}



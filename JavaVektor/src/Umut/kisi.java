/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Umut;


public class kisi {
    public String Adi;
    public String SoyAdi;
    public String Memleket;
    public int Yas;
    

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

    public String getSoyAdi() {
        return SoyAdi;
    }

    public void setSoyAdi(String SoyAdi) {
        this.SoyAdi = SoyAdi;
    }

    public String getMemleket() {
        return Memleket;
    }

    public void setMemleket(String Memleket) {
        this.Memleket = Memleket;
    }

    public int getYas() {
        return Yas;
    }

    public void setYas(int Yas) {
        this.Yas = Yas;
    }
    
    public kisi(){
        
    }
    
    public kisi(String ad,String soyad,String memleket,int yas ){
        this.Adi=ad;
        this.SoyAdi=soyad;
        this.Memleket=memleket;
        this.Yas=yas;
        
        
        
    }
    
    public void bilgiler(){
        System.out.println("Kişinin adı "+Adi+" Soyadı "+SoyAdi+" Memleketi "+Memleket+" Yaşı: "+Yas);
        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javavektor;
public class Kisi {
    String ad;
    String soyAd;
    String memleket;
    int yas; 
public void bilgiler(){
    System.out.println(ad+" "+soyAd+""+memleket+""+yas);
}
    public Kisi(String ad, String soyAd, String memleket, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.memleket = memleket;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    
}

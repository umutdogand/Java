/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gamze;

/**
 *
 * @author vektorel
 */
public class KISI 
{
    public String adi;
    public String soyadi;
    public String memleket;
    public int yas;
    
    public KISI()
    {      
    }
    
    public KISI(String ad, String soyad, int yas, String memleket)
    {
        this.adi = ad;
        this.soyadi = soyad;
        this.memleket = memleket;
        this.yas = yas;        
    }
    
     public void yazdir()
    {
        System.out.println(adi + "\t" + soyadi + "\t" + yas + "\t" + memleket);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
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
    
    public void bilgiler()
    {
        System.out.println( adi + " kişisinin " + "soyadi " + soyadi + ". " + "Yasi " + yas + ". " + "Memleketi " + memleket + "."); // aralarda "\n" veya "\t" kullanabiliriz.
    }
}

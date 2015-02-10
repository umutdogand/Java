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
public class METODLAR {
    
        public static void main(String[] args) {
            
        //DERS4 ders4 = new DERS4();
        DERS4 ders4 = new DERS4("GAMZE","MAZLUM");
        //ders4.cokBoyutluDiziler();
        
//        ders4.adi = "GAMZE"; //diğer sınıfın elemanlarına erişiyoruz.
//        ders4.soyadi = "MAZLUM";
//        ders4.yazdir();
//        ders4.getAdi();
//        ders4.setAdi("ZEHRA");
//        ders4.setYas(26);
//        ders4.getYas();
        
        KISI kisi = new KISI();
        
        kisi.setAdi("GAMZE");
        kisi.setSoyadi("MAZLUM");
        kisi.setMemleket("TRABZON");
        kisi.setYas(26);
        
        kisi.bilgiler();
        
//        kisi.adi = "GÜRKAN";
//        kisi.soyadi = "MAZLUM";
//        kisi.yas = 18;
//        kisi.memleket = "TRABZON";
//        
//        kisi.yazdir();
        
        kisi.getAdi();
        kisi.getSoyadi();
        kisi.getMemleket();
        kisi.getYas();
        
        kisi.yazdir();
        
 //       kisi.deneme(); // private olduğu için hata veriyor
 //       kisi.deneme2(); // protected olduğu için aynı paket içerinde erişebiliyoruz. ama mesela adil dosyasının içine gamze paketini import ettikten sonra deneme2 ye erişmeye çalışırsak erişemeyiz.

        ders4.randomDeneme();
    }
    
}

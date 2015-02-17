/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahattin.Ders6;

/**
 *
 * @author vektorel
 */
public class personel implements fakulte {
String Ad;
String Soyad;
int yas;
int maas;

    public personel() {
    }

    public personel(String Ad, String Soyad, int yas) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.yas = yas;
        
    }

    public void maashesapla() {
        if(yas>35){
        maas+=200;
        }
        System.out.print(Ad + " "+Soyad+" "+"'in Bu ayki Maaşı:");
    }

    @Override
    public void fakultebul() {
        
    }
    

}

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
public class muhendis extends personel {
    int kidem;

    public muhendis(int kidem, String Ad, String Soyad, int yas) {
        super(Ad, Soyad, yas);
        this.kidem = kidem;
    }
    
    @Override
    public void maashesapla(){
    super.maashesapla();
    if(kidem>4){
    maas+=100;
    }
    maas+=1500;
        System.out.println(maas);
    }
}

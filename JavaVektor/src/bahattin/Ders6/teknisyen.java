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
public class teknisyen extends personel {

    public teknisyen(String Ad, String Soyad, int yas) {
        super(Ad, Soyad, yas);
    }

    @Override
    public void maashesapla() {
        super.maashesapla();
        maas += 1000;
        System.out.println(maas);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders6.Ders6b;

/**
 *
 * @author vektorel
 */
public class Muhendis extends Personel {

    int kidem;

    public Muhendis(int kidem, String ad, String soyAd, int yas) {
        super(ad, soyAd, yas);
        this.kidem = kidem;
    }

    @Override
    public void maasHesapla() {
        super.maasHesapla();
        if (kidem > 4) {
            maas += 100;
        }
        maas += 1500;
        System.out.println(maas);
    }
}

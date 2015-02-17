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
public class Ogrenci extends Bolum implements Fakulte{

    @Override
    public void bolumGetir() {
        System.out.println("Ogrenci Bölümü Hesaplanıyor");
    }

    @Override
    public void fakulteBul() {
        System.out.println("Fakülte Bilgileri Hesaplanıyor");
    }
    
}

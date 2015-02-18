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
public class dekan extends personel{
    String fakulte;

    public dekan(String fakulte, String Ad, String Soyad, int yas) {
        super(Ad, Soyad, yas);
        this.fakulte = fakulte;
    }
    @Override
    public void maashesapla(){
    super.maashesapla();
    maas+=5000;
        System.out.println(maas);
    
    }
}

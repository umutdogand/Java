
package Umut.Ders6;


public class Prof  extends Personel{

    public Prof(String Ad, String Soyad, int yas) {
        super(Ad, Soyad, yas);
    }

    @Override
    public void MaasHesapla(){
       
        super.MaasHesapla();
        maas=maas+2000;
        System.out.println(maas);
    }
    
}

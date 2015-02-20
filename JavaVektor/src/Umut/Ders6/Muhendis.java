
package Umut.Ders6;

public class Muhendis extends Personel {
int kidem;


    public Muhendis(int kidem, String Ad, String Soyad, int yas) {
        super(Ad, Soyad, yas);
        this.kidem = kidem;
    }

    @Override
    public void MaasHesapla(){
        if(kidem>4){
            maas=maas+100;
        }
       super.MaasHesapla();
       maas+=1500;
        System.out.println(maas);
       
    }
    
}

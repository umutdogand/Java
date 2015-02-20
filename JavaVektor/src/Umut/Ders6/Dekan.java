
package Umut.Ders6;


public class Dekan extends Personel{
String Fac,Mühendislik;
    public Dekan(String Fac, String Ad, String Soyad, int yas) {
        super(Ad, Soyad, yas);
        this.Fac = Fac;
    }

    
    
    @Override
    public void MaasHesapla(){
        if(Fac.equalsIgnoreCase(Mühendislik)){
            maas=maas+600;
            
        }
        super.MaasHesapla();
       maas+=3000;
        System.out.println(maas);
       
        
    }
    
}

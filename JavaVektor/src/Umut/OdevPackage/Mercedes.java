

package Umut.OdevPackage;


public class Mercedes extends Galeri {

    public Mercedes(int ArabaYasi, int fiyat, String donanım, String mrka) {
        super(fiyat, donanım, mrka);
        this.ArabaYasi = ArabaYasi;
    }
    int ArabaYasi;

   


    
    @Override
    public void KdvHesapla(){
        if(ArabaYasi<4){
        fiyat+=500;
        }
         fiyat+=120.000;
         System.out.println(fiyat);
    }
   
    
}

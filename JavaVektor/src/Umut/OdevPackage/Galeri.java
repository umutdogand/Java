
package Umut.OdevPackage;

public class Galeri {
int fiyat,ArabaYasi;
    String donanım,mrka;
    
    public Galeri(){
        
    }
    
    public Galeri(int fiyat , String donanım, String mrka) {
        this.fiyat = fiyat;
        
        this.donanım = donanım;
        this.mrka=mrka;
    }
    
    public void KdvHesapla(){
        int kdv=(fiyat*8)/100;
        System.out.println(mrka+"'nın Kdv dahil fiyatı: ");
    }
    
    
}

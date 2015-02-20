
package Umut.Ders6;


public class Personel {
    
    String Ad,Soyad;
    int yas,maas=0;
    public Personel(){
        
    }
    
    public Personel(String Ad,String Soyad,int yas){
        this.Ad=Ad;
        this.Soyad=Soyad;
        this.yas=yas;
        
        
    }
    
    public void MaasHesapla(){
        if(yas>35){
            maas=maas+300;
        }
        System.out.println(Ad+" "+Soyad+"'ın bu ayki maaşı: "); 
       
    }
    
    
    
   public final void izinGunu(){
       System.out.println("Hiç İzin Kullanmadınız ");
   }
    
    
}

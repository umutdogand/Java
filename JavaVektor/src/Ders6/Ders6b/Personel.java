package Ders6.Ders6b;

public class Personel implements Fakulte{

    String ad, soyAd;
    int yas,maas=0;

    public Personel() {

    }
 
    public Personel(String ad, String soyAd, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
    }
    public void maasHesapla(){
        if(yas>35)
            maas+=200;
        System.out.println(ad+"  "+soyAd+" 'In Bu ayki Maası :" );
    }

    @Override
    public void fakulteBul() {
        
    }
    public final void izinGunu()
    {
        System.out.println("Hiç İzin Kullanmadınız");
    }
//    public abstract void izinGunu();
    
}


package Ders7;


public class Ogrenci {
    String ad,soyAd;
    int no;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyAd, int no) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.no = no;
    }

    @Override
    public boolean equals(Object obj) {
        return new Integer(this.no).equals(((Ogrenci)obj).no); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return this.no; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

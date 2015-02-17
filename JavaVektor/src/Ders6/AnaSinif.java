package Ders6;

public class AnaSinif {
    public static void main(String[] args) {
        HayvanAgirlikHesapla hesaplaAgirlik =new HayvanAgirlikHesapla();
        double gelenDeger=hesaplaAgirlik.hesapla("fare");
        System.out.println(gelenDeger);
    }
}

package Ders6.Ders6a;

public class Kedi extends Hayvan {

    public void patiSayisi() {
        System.out.println("Pati Sayisi 4");
    }

    public Kedi() {
    }

    public double agrlikHesapla() {
        return super.agrlikHesapla()- 1;
               
    }
}

package Ders6.Ders6a;

public class Hayvan {

    int yas;

    public Hayvan() {
    }

    public Hayvan(int yas) {
        this.yas = yas;
        agrlikHesapla();
    }
    

    public double agrlikHesapla() {
        double agirlik=yas*2;
        return agirlik;
    }

    public void beslenme() {

    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            yas = 0;
        }
        this.yas = yas;
    }
}

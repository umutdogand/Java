
package OdevDers4;

public class Hayvan {
    String tur;
    String cins;
    double agrilik;
    int yas;
    static double toplamagirlik=0.0;
    public void toplamagirlik(){
        System.out.println(toplamagirlik);
    }

    public Hayvan() {
        toplamagirlik=toplamagirlik+this.agrilik;
    }

    public Hayvan(String cins,String tur, double agrilik, int yas) {
        this.tur = tur;
        this.agrilik = agrilik;
        this.yas = yas;
        this.cins=cins;
        toplamagirlik=toplamagirlik+agrilik;
    }
    public void yazdir(){
        System.out.println("Hayvan Cinsi :"+this.cins+"  türü:"+this.tur+"   agirlik:"+this.agrilik+"  Yas"+this.yas);
    }
    public void yazdir(String cins,String tur, double agrilik, int yas){
        System.out.println("Hayvan Cinsi :"+cins+"  türü:"+tur+"   agirlik:"+agrilik+"  Yas"+yas);
    }
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public double getAgrilik() {
        return agrilik;
    }

    public void setAgrilik(double agrilik) {
        this.agrilik = agrilik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    
    
}

package OdevDers4;

public class AnaSinif {

    public static void main(String[] args) {
        Hayvan kedi = new Hayvan();
        kedi.cins="Kedi";
        kedi.tur="Tekir";
        kedi.agrilik=12.3;
        kedi.yas=3;
        kedi.yazdir();
        
        Hayvan kopek=new Hayvan("Kopek","Golden",34.5,7);
        kopek.yazdir();
        
        Hayvan fare=new Hayvan();
        fare.yazdir("Fare","Hamster",1.2,1);
        fare.toplamagirlik();
        
        
//        fare.setCins("Fare");
//        fare.setTur("Hamster");
//        fare.setAgrilik(1.2);
//        fare.setYas(1);

    }
}

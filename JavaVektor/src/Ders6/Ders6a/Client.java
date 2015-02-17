

package Ders6.Ders6a;


public class Client {
    public static void main(String[] args) {
        Kedi kedi=new Kedi();
        kedi.setYas(12);
        double agirlik=kedi.agrlikHesapla();
        System.out.println(agirlik);
    }
}

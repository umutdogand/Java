
package Adil.Ders8;


public class HataAyiklama {
    static int toplam=0;
    public static void main(String[] args) {
        
        recursive(10);
        System.out.println(toplam);
    }
    private static void recursive(int sayi){
        if(sayi==0)
            return;
        toplam=toplam+sayi;
        recursive(sayi-1);
    }
    
    
}

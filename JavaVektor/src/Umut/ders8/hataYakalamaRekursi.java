
package Umut.ders8;

public class hataYakalamaRekursi {
    static int toplam;
    public static void main(String[] args) {
        
    rekursiFonk(50);//girilen sayıya kadar tüm sayıları toplama
       // System.out.println(toplam+1);
    }
    
    private static void rekursiFonk(int sayi){
        if(sayi==1)
            return;
        toplam=toplam+sayi;
        rekursiFonk(sayi-1);
        
        
    }
    
            
    
   
}



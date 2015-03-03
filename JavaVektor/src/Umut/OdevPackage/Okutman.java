
package Umut.OdevPackage;

import java.io.File;


public class Okutman implements  Personel{
    
    
    public static void main(String[] args) {
        klasör();
    }
     public static final String PATH = "C:/Java1";
    
    
    
    
    
    
    public static void klasör(){
          File klasör = new File(PATH);
          
           klasör.mkdir();
        File dosyaOlustur = new File("C:/Java1/Okutman.txt");
        
        try {
            dosyaOlustur.createNewFile();
            } catch (Exception e) {
                
            }
     }
    
}

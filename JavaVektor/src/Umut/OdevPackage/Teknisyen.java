
package Umut.OdevPackage;

import static Umut.OdevPackage.Mühendis.PATH;
import java.io.File;


public class Teknisyen implements  Personel {
    
    
    public static void main(String[] args) {
        klasör();
    }
     public static final String PATH = "C:/Java1";
    
    
    
    
    
    
    public static void klasör(){
          File klasör = new File(PATH);
          
           klasör.mkdir();
        File dosyaOlustur = new File("C:/Java1/Teknisyen.txt");
        
        try {
            dosyaOlustur.createNewFile();
            } catch (Exception e) {
                
            }
     }
    
}

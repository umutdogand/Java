
package Umut.OdevPackage;

import static Ders8.IOIslemleri.PATH;
import java.io.File;

public class Mühendis implements  Personel{
    
    public static void main(String[] args) {
        klasör();
    }
    
     public static final String PATH = "C:/Java1";
     
     public static void klasör(){
          File klasör = new File(PATH);
          
           klasör.mkdir();
        File dosyaOlustur = new File("C:/Java1/muhendis.txt");
        
        try {
            dosyaOlustur.createNewFile();
            } catch (Exception e) {
                
            }
     }
    
}


package Umut.ders8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IOislemleri {
    public static final String PATH="C:/JavaVektorel";
    public static void main(String[] args) {
        Ogrenci o1=new Ogrenci("Umut", "Dilek","Elektrik", 33333333);
        Ogrenci o2=new Ogrenci("ali","xxx","Makina",44444444);
        Ogrenci o3=new Ogrenci("Veli", "yyy","Bilgisayar", 55555555);
        ogrenciYazdir(o1);
    }

    private static void ogrenciYazdir(Ogrenci o1) {
        String ogrenci=o1.getName()+"-"+o1.getSurname()+"-"+o1.getBolum()+"-"+o1.getTC();
        
         File Byazma= new File(PATH);
         Byazma.mkdir();
         File Byazma1= new File(PATH+"/java1.txt");
        try {
            Byazma1.createNewFile();

        } catch (Exception e) {
        }
         try{
           
            FileWriter yaz = new FileWriter(Byazma1,true);
            BufferedWriter bw= new BufferedWriter(yaz);
                 bw.write(ogrenci);
                 bw.newLine();
                 bw.flush();
                 
             bw.close();
            
        }catch(Exception e){
            
        }
        
    }
    
    
    
    
    
    
}

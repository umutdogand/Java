
package Adil.Ders8;

import static Ders8.IOIslemleri.PATH;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class IOislemleri {
    public static final String PATH = "C:/JavaVektorel";
    public static void main(String[] args) {
        
        Ogrenci o1=new Ogrenci("Adil", "İnce", "BilgisayarM.", 1234);
        ogrenciKaydet(o1);
        Ogrenci o2=new Ogrenci("Ahmet", "İnce", "Iktisat.", 1235434);
        ogrenciKaydet(o2);
        Ogrenci o3=new Ogrenci("vural", "Gunduz", "Fizik.", 341234);
        ogrenciKaydet(o3);
        Ogrenci o4=new Ogrenci("Ahmet", "Danacı", "MakineM..", 90881234);
        ogrenciKaydet(o4);
        Ogrenci o5=new Ogrenci("Aykut", "Akkan", "BilgisayarM.", 123344);
        ogrenciKaydet(o5);
        Ogrenci o6=new Ogrenci("Mahmut", "İnce", "tıp", 1256734);
        ogrenciKaydet(o6);
    }
    private static void ogrenciKaydet(Ogrenci o){
        String ogrenci=o.Ad+"-"+o.Soyad+"-"+o.Bolum+"-"+o.no;
        File dosya = new File(PATH);

        dosya.mkdir();
        File dosyaOlustur = new File("C:/JavaVektorel/java1.txt");
        try {
            dosyaOlustur.createNewFile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            FileWriter wr= new FileWriter(dosyaOlustur,true);
            BufferedWriter bw= new BufferedWriter(wr);
            bw.write(ogrenci);
            bw.newLine();
            bw.flush();
            bw.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}

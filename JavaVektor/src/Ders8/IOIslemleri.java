package Ders8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class IOIslemleri {

    public static final String PATH = "C:/JavaVektorel";

    public static void main(String[] args) {
//        temelIslemler();
//        dosyaYazma();
//        dosyaOkuma();
//        bufferYazma();
        bufferOkuma();
    }

    private static void temelIslemler() {
        File dosya = new File(PATH);

        dosya.mkdir();
        File dosyaOlustur = new File("C:/JavaVektorel/java1.txt");
        try {
            dosyaOlustur.createNewFile();

            System.out.println(dosya.getName());
            System.out.println(dosya.getParent());
            System.out.println(dosya.getPath());
            System.out.println(dosya.length());
            System.out.println(dosya.renameTo(new File("C:/JavaVektorel")));
            System.out.println("--");
            System.out.println(dosyaOlustur.getName());
            System.out.println(dosyaOlustur.length());
            System.out.println(dosyaOlustur.getParent());
            System.out.println(dosyaOlustur.getPath());
            System.out.println(dosyaOlustur.getParentFile());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private static void dosyaYazma() {
        File yazma = new File(PATH + "/java1.txt");
        try {
            FileWriter yaz = new FileWriter(yazma, true);
            yaz.write(" İlk Yazma İşlemi");
            yaz.close();
        } catch (Exception e) {
        }
    }

    private static void dosyaOkuma() {
        File okuma = new File(PATH + "/java1.txt");
        char[] bilgi = new char[(int) okuma.length()];
        try {
            FileReader oku = new FileReader(okuma);
            oku.read(bilgi);
            System.out.println(bilgi);
        } catch (Exception e) {
        }
    }

    private static void bufferYazma() {
        File yazma = new File(PATH + "/java1.txt");
        try {
            FileWriter yaz = new FileWriter(yazma, true);
            BufferedWriter rd = new BufferedWriter(yaz);
            for (int i = 0; i < 10; i++) {
                rd.write(i * 2 + "");
                rd.newLine();
                rd.flush();
            }
            rd.close();

        } catch (Exception e) {
        }
    }

    private static void bufferOkuma() {
        File yazma = new File(PATH + "/java1.txt");
        try {
            FileReader yaz = new FileReader(yazma);
            BufferedReader rd = new BufferedReader(yaz);
            String satir = rd.readLine();
            while (satir != null) {
                System.out.println(satir);
                satir=rd.readLine();
            }
            rd.close();

        } catch (Exception e) {
        }
    }
}

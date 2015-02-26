/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahattin.Ders8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class IOIslemleri {

    public static final String PATH = "C:/JavaVektorel";

    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci("Ahmet", "GÜNEŞ", "elektrik", 1234);
        Ogrenci o2 = new Ogrenci("Mustafa", "Ekmen", "elektrik", 3545);
        Ogrenci o3 = new Ogrenci("Zafer", "Dığış", "bilgisayar", 3542);
        Ogrenci o4 = new Ogrenci("Metin", "Kalkan", "tıp", 7852);
        Ogrenci o5 = new Ogrenci("Hasan", "Okut", "elektrik", 1275);
        Ogrenci o6 = new Ogrenci("Fatih", "Bal", "elektrik", 1242);
        ogrenciKaydet(o6);
//        temelIslemler();
//        dosyaYazma();
//        dosyaOkuma();
//        bufferYazma();
//        bufferOkuma();
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
                satir = rd.readLine();
            }
            rd.close();

        } catch (Exception e) {
        }
    }

    public static void ogrenciKaydet(Ogrenci o) {
        String Ogrenci = o.ad + " " + o.soyad + " " + o.bolum + " " + o.tc;
        File dosya = new File("C:/Java");
        dosya.mkdir();
        File dosyaF = new File("C:/Java/Ogrenci.txt");
        if (!dosyaF.exists()) {
            try {
                dosyaF.createNewFile();

            } catch (Exception e) {
            }
        }
        try {
            FileWriter wr = new FileWriter(dosyaF,true);
            BufferedWriter bwr = new BufferedWriter(wr);
            bwr.write(Ogrenci);
            bwr.newLine();
            bwr.flush();
            bwr.close();
        } catch (Exception e) {
            System.out.println(e.toString());    
        }

    }
}

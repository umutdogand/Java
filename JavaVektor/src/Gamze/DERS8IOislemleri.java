/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gamze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author vektorel
 */
public class DERS8IOislemleri 
{
    public static final String PATH = "C:/java"; //oluşturacağımız dosyalar için klasör belirttik.
    //public static final String PATH2 = "C:/javaVektorel";
    
    public static void main(String[] args)
    {
       DERS8ogrenci ogrenci1 = new DERS8ogrenci("Gamze", "Mazlum",1234, "ELOHAB MÜH.");
       DERS8ogrenci ogrenci2 = new DERS8ogrenci("Ayşe", "Öztürk",1588, "BİLG. MÜH.");
       DERS8ogrenci ogrenci3 = new DERS8ogrenci("Fatma", "Özçelik",7852, "ELEKTRİK MÜH.");
       DERS8ogrenci ogrenci4 = new DERS8ogrenci("Ali", "Alkın",4582, "MAKİNE MÜH.");
       DERS8ogrenci ogrenci5 = new DERS8ogrenci("Veli", "Aslan",7512, "JEOLOJİ MÜH.");
       DERS8ogrenci ogrenci6 = new DERS8ogrenci("Mehmet", "Arslan",3582, "JEOFİZİK MÜH.");
       
       bufferYazma(ogrenci1);
       bufferYazma(ogrenci2);
       bufferYazma(ogrenci3); 
       bufferYazma(ogrenci4);
       bufferYazma(ogrenci5);
       bufferYazma(ogrenci6);
       bufferOkuma();
    }
    
    private static void bufferYazma(DERS8ogrenci o) 
    {       
        String ogrenci=o.ad+"-"+o.soyAd+"-"+o.bolum+"-"+o.no; //yazma yapacağımız format belirlendi.
        File yazma = new File(PATH + "/ogrenci.txt"); //hangi dosyaya yazacağımızı gösterdik.       
        try 
        {
            FileWriter yaz = new FileWriter(yazma, true);
            BufferedWriter rd = new BufferedWriter(yaz);
            rd.write(ogrenci); //bilgiyi yaz
            rd.newLine(); //alt satıra geç
            rd.flush(); //mevcut buffera yazmak için bunu kullandık.
            rd.close(); //dosyayı kapat
        } 
        catch (Exception e) 
        {
        }
    }
    
    private static void bufferOkuma() 
    {
        File yazma = new File(PATH + "/ogrenci.txt");
        try 
        {
            FileReader yaz = new FileReader(yazma);
            BufferedReader rd = new BufferedReader(yaz);
            String satir = rd.readLine(); 
            while (satir != null) 
            {
                System.out.println(satir); 
                satir=rd.readLine(); //satırdaki bilgiyi al
            }
            rd.close();
        } 
        catch (Exception e) 
        {
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gamze;

 //ALT İNSERT tuşlarına aynı anda basarak metodları görebiliriz.
import java.util.Random;


/**
 *
 * @author vektorel
 */
public class DERS4 
{    
    public String adi;
    public String soyadi;
    public int yas;
    
    public void randomDeneme()
    {
        Random deneme = new Random();
        int gelenDeger = deneme.nextInt();
        int gelenDeger2 = deneme.nextInt(11);
        int gelenDeger3 = 5 + deneme.nextInt(11); //0 dan başladığı için alt sınır eklemek istiyorsak bu alt sınırı ekleyeceğiz örneğin 5ten başlasın diyorsak 5 ekleyeceğiz.
        double gelenDeger4 = deneme.nextInt();
        
        System.out.println(gelenDeger);
        System.out.println(gelenDeger2);
        System.out.println(gelenDeger3);
        System.out.println(gelenDeger4);
    }
    
    public DERS4()
    {      
    }
    
 /**************************************************************bunları alt insert yapıp getter setter seçerek yaptık**
     * @return */
    public String getAdi() { //son yaratılan nesnenin tutulan adını alıyoruz
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<0)
            yas=yas*(-1);
        this.yas = yas;
    }
    
 /**
     * @param ad*   
     * @param soyad********************************************************************************************************************/   
   
    public DERS4(String ad, String soyad)
    {
        this.adi = ad; //DERS4 NESNESİ YARATTIK, sadece ders4'e ait, o an yaratılan objeleri gösteriyor.
        this.soyadi = soyad;
    }
      
    public void yazdir()
    {
        System.out.println(adi + soyadi);
    }
    
    public void cokBoyutluDiziler() // new komutuyla birşey oluşturuyorsak o sınıfa ait bir nesne oluşturuyoruz demektir.
    {
        int max = 0;
        int min = 1000000;
        int toplam = 0;
        int [][]diziAraba = new int[4][3]; //satırlar araba modeli, sütunlar aylara göre ortalama satış
        
        diziAraba[0][0] = 50;
        diziAraba[0][1] = 250;
        diziAraba[0][2] = 150;
        diziAraba[1][0] = 350;
        diziAraba[1][1] = 7750;
        diziAraba[1][2] = 550;
        diziAraba[2][0] = 650;
        diziAraba[2][1] = 50;
        diziAraba[2][2] = 5;
        diziAraba[3][0] = 950;
        diziAraba[3][1] = 250;
        diziAraba[3][2] = 150;
  /**********************************************************************************************************/        
        for(int i=0; i<diziAraba.length; i++) //en çok hangi ayda satış yapılmış bul
        {
            for(int j=0; j<diziAraba[0].length; j++)
            {
                if(max < diziAraba[i][j])
                {
                    max = diziAraba[i][j];
                }
            }
        }
        System.out.println(max);
 /**********************************************************************************************************/       
        for(int i=0; i<diziAraba.length; i++) //en çok hangi ayda satış yapılmış bul
        {
            for(int j=0; j<diziAraba[0].length; j++)
            {
                if(min > diziAraba[i][j])
                {
                    min = diziAraba[i][j];
                }
            }
        }
        System.out.println(min); 
  /**********************************************************************************************************/              
        for(int j=0; j<diziAraba[0].length; j++) //bmw için ilk 3 aylık satış toplamı
        {
            toplam += diziAraba[0][j];
        }       
       
        System.out.println(toplam); 
  /**********************************************************************************************************/  
        
    }
  
    
}

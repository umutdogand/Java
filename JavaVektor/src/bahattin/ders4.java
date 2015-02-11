/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bahattin;

import java.util.Random;

/**
 *
 * @author vektorel
 */
public class ders4 {
       public ders4(){
   
   }
       
       public void bilgiler(){
           System.out.println(adi+" "+soyadi+" "+memleketi+ " "+yas);
       }
       
       public void randomislemler(){
       Random rd = new Random() ;
       int gelendeger = 5+rd.nextInt(10);
       
       }
       
    public ders4(String adi, String soyadi, String memleketi, int yas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.memleketi = memleketi;
        this.yas = yas;
    }
    
    public String adi;
    public String soyadi;
    public String memleketi;
    public int yas;

        public String getAdi() {
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

        public String getMemleketi() {
            return memleketi;
        }

        public void setMemleketi(String memleketi) {
            this.memleketi = memleketi;
        }

        public int getYas() {
            return yas;
        }

        public void setYas(int yas) {
            this.yas = yas;
        }
    
    

        public void cokBoyutluDiziler(){
    
    int [][] diziAraba=new int [4][3];
    diziAraba[0][0]=50;
    diziAraba[0][1]=150;
    diziAraba[0][2]=10;
    diziAraba[1][0]=60;
    diziAraba[1][1]=30;
    diziAraba[1][2]=25;
    diziAraba[2][0]=100;
    diziAraba[2][1]=40;
    diziAraba[2][2]=15;
    diziAraba[3][0]=5;
    diziAraba[3][1]=125;
    diziAraba[3][2]=17;
    int eb=0;
 /*       for (int i = 0; i < diziAraba.length; i++) {
            for (int j = 0; j < diziAraba[0].length; j++) {
                if (eb<diziAraba[i][j])
                {
                eb=diziAraba[i][j];
                }
            }
        }
            System.out.println(eb);*/ //Cok boyutlu dizide en büyüğü bulma
    int toplam=0;
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < diziAraba[0].length ; j++) {
                     toplam=toplam+diziAraba[i][j];
                
                
                
                }
            }
            System.out.println(toplam);
    }
}


package Umut;

import java.util.Random;
import java.util.Scanner;

public class Ödev33 {
 
    
    public void ebekÖdev(){
        int min=0;
        int max=0;
        int [] [] dizi33 = new int [3] [3];
         Random rd = new Random();
         int num1=50+rd.nextInt(1000);
         int num2=50+rd.nextInt(1000);
         int num3=50+rd.nextInt(1000);
         int num4=50+rd.nextInt(1000);
         int num5=50+rd.nextInt(1000);
         int num6=50+rd.nextInt(1000);
         int num7=50+rd.nextInt(1000);
         int num8=50+rd.nextInt(1000);
         int num9=50+rd.nextInt(1000);
                                                                         
                
         
          dizi33 [0] [0]=num1;
          dizi33 [0] [1]=num2;
          dizi33 [0] [2]=num3;
          dizi33 [1] [0]=num4;
          dizi33 [1] [1]=num5;
          dizi33 [1] [2]=num6;
          dizi33 [2] [0]=num7;
          dizi33 [2] [1]=num8;
          dizi33 [2] [2]=num9;
          
          
          for(int i=0; i<dizi33.length; i++) 
        {
            for(int j=0; j<dizi33[0].length; j++)
            {
                if(max < dizi33[i][j])
                {
                    max = dizi33[i][j];
                }
            }
        }
          
        for(int i=0; i<dizi33.length; i++) 
        {
            for(int j=0; j<dizi33[0].length; j++)
            {
                if(min > dizi33[i][j])
                {
                    min = dizi33[i][j];
                }
            }
        }
          System.out.println("En büyük: "+max+"En küçük: "+min);
          
         
    }
    
    public void ebekÖdev2(){
        
        double [] [] dizi55 = new double [5] [5];
         Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) 
            {
                
                dizi55 [i] [j] =50+rd.nextDouble()*1000;
                
            }
            
        }
        
        
    }
    
    public void SayiBulma(){
         Random rd = new Random();
         int sayi=1+rd.nextInt(9);
         int girilensayi;
         Scanner scan = new Scanner(System.in);
         int kullanılanhak=0;
        for (int i = 0; i < 5; i++) {
            
           System.out.println("Lütfen Bir Sayı Giriniz: ");
          girilensayi=scan.nextInt();
          if(girilensayi==sayi){
            System.out.println("Tebrikler Sayıyı Buldunuz");
            break;
        }
          if(girilensayi<sayi){
              System.out.println("Lütfen daha büyük bir değer giriniz");
          }
          if(girilensayi>sayi){
              System.out.println("Lütfen daha küçük bir değer giriniz");
          }
            kullanılanhak++;
        }
         if(kullanılanhak==5){
             System.out.println("Maalesef sayıyı bulamadınız :( ");
         }
        
    }
    
}

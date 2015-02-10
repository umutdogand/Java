package Umut;

import java.util.Scanner;


public class ders3 {
    
    public void breakislem(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i==7)
                break;
            
        }
    }
    public void switchIslemleri(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilensayi=scan.nextInt();
        
        switch(girilensayi){
            case 1:
                System.out.println("Girilen sayı Bir");
                break;
                
                case 2:
                    System.out.println("Girilen sayı iki");
                break;
                     
                case 3:
                    System.out.println("Girilen sayı üç");
                break;
                          
                case 4:
                    System.out.println("Girilen sayı dört");
                break;
                               
                case 5:
                    System.out.println("Girilen sayı beş");
                break;
                                    
                case 6:
                    System.out.println("Girilen sayı altı");
                break;
                                         
                case 7:
                    System.out.println("Girilen sayı yedi");
                break;
                                              
               case 8:
                   System.out.println("Girilen sayı sekiz");
                break;
                                                   
                 case 9:
                     System.out.println("Girilen sayı dokuz");
                break;
                     
                     
                         
            default:
        }
        
                
    }
    public void stringIslemleri(){
        String islemler="UmutDilek";
         char harf=islemler.charAt(2);
         System.out.println(harf);
    }
    
    public void basamaklarinaAyirma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        String gir=scan.nextLine();
        char onluk=gir.charAt(0);
        char birler=gir.charAt(1);
        
        String on=OnlarHesapla(onluk);
       String bir= BirlerHesapla(birler);
        System.out.println(on+bir);
       
        
        
    }
    public String OnlarHesapla(char onlar){
       switch(onlar){
           case'1':
              return"ON";
               
          case'2':
              return "YİRMİ";
              
              case'3':
              return "OTUZ";
                  
               case'4':
              return "KIRK";
                   
               case'5':
              return "ELLİ";
                   
                 case'6':
              return "ALTMIŞ";
                     
                 case'7':
              return "YETMİŞ";
                     
                     case'8':
              return "SEKSEN";
                         
                         case'9':
              return "DOKSAN";
                             
              default:
              return "";
       }
       
    }
    public  String BirlerHesapla(char birler){
        switch(birler){
            
      
        case'1':
              return"BİR";
               
          case'2':
              return "İKİ";
              
              case'3':
              return "ÜÇ";
                  
               case'4':
              return "DÖRT";
                   
               case'5':
              return "BEŞ";
                   
                 case'6':
              return "ALTI";
                     
                 case'7':
              return "YEDİ";
                     
                     case'8':
              return "SEKİZ";
                         
                         case'9':
              return "DOKUZ";
              
                         default:   
                             return"";           
        }
        

    }
    
    
    public void Islemler(){
        Scanner scan = new Scanner(System.in);
        int toplam=0;
        System.out.println("Kaç Tane Sayıyı Toplamak İstiyorsunuz? ");
        int gir=scan.nextInt();
        
        int [] dizi = new int[gir];
        for (int i = 0; i < gir; i++) {
            System.out.println("Lütfen Sayı Giriniz: ");
            dizi[i]=scan.nextInt();
            toplam=toplam+dizi[i];
            
        }
        System.out.println("Girilen Sayıların Toplamı: "+toplam+"ve girilen 5. sayı: "+dizi[4]);
        
        
        
        
    }
    public void dizi(){
        int [] dizi = new int[5];
        Scanner scan =new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Lütfen Sayı Giriniz: ");
            dizi[i]=scan.nextInt();
      
        }
        System.out.println(dizi[4]+"\n"+dizi[3]+"\n"+dizi[2]+"\n"+dizi[1]+"\n"+dizi[0]);
        
    }
    public void ÖdevbasamaklarinaAyirma(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Üç Basamaklı Bir Sayı Giriniz: ");
        String gir=scan.nextLine();
        char yuzluk=gir.charAt(0);
        char onluk=gir.charAt(1);
        char birler=gir.charAt(2);
        
        String yuz=ÖdevYuzlerHesapla(yuzluk);
        String on=ÖdevOnlarHesapla(onluk);
       String bir= ÖdevBirlerHesapla(birler);
        System.out.println(yuz+on+bir);
       
   
}
     public String ÖdevYuzlerHesapla(char yuzler){
       switch(yuzler){
           case'1':
              return"YÜZ";
               
          case'2':
              return "İKİYÜZ";
              
              case'3':
              return "ÜÇYÜZ";
                  
               case'4':
              return "DÖRTYÜZ";
                   
               case'5':
              return "BEŞYÜZ";
                   
                 case'6':
              return "ALTIYÜZ";
                     
                 case'7':
              return "YEDİYÜZ";
                     
                     case'8':
              return "SEKİZYÜZ";
                         
                         case'9':
              return "DOKUZYÜZ";
                             
              default:
              
       return "";
    }
    }
     public String ÖdevOnlarHesapla(char onlar){
       switch(onlar){
           case'1':
              return"ON";
               
          case'2':
              return "YİRMİ";
              
              case'3':
              return "OTUZ";
                  
               case'4':
              return "KIRK";
                   
               case'5':
              return "ELLİ";
                   
                 case'6':
              return "ALTMIŞ";
                     
                 case'7':
              return "YETMİŞ";
                     
                     case'8':
              return "SEKSEN";
                         
                         case'9':
              return "DOKSAN";
                             
              default:
              return "";
       }
       
    }
     public  String ÖdevBirlerHesapla(char birler){
        switch(birler){
            
      
        case'1':
              return"BİR";
               
          case'2':
              return "İKİ";
              
              case'3':
              return "ÜÇ";
                  
               case'4':
              return "DÖRT";
                   
               case'5':
              return "BEŞ";
                   
                 case'6':
              return "ALTI";
                     
                 case'7':
              return "YEDİ";
                     
                     case'8':
              return "SEKİZ";
                         
                         case'9':
              return "DOKUZ";
              
                         default:   
                             return"";           
        }
        

    }
     public void ÖdevDizi(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç Tane Sayı Gireceksiniz?  ");
        int num1=input.nextInt();
        
        
        int [] array = new int[num1];
        for (int i = 0; i < num1; i++) {
            System.out.println("Lütfen Bir Sayı Giriniz: ");
            array[i]=input.nextInt();
            
            
            
        }
        
        int max =array[0];
        int min =array[0];
        for (int i = 0; i <num1; i++) {
            if(max < array[i])
            {
                max = array[i];
            }
            if(min > array[i])
            {
                min = array[i];
            }
        }
        
        System.out.println(" Girdiğiniz En Büyük Sayı: "+max+" Girgidiğiz En Küçük Sayı: "+min+" Girdiğiniz 3. Sayı: "+array[2]);
                
    } 
     
    
     
     
     
    
}
       
    



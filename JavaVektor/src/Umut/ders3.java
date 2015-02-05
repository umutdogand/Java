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

}

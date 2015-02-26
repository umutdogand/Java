/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gamze;

/**
 *
 * @author vektorel
 */
public class DERS8 
{  //HATA YAKALAMA
    static int toplam = 0;
    
    public static void main(String[] args)
    {
       
        toplama(3);
    }
    
    public static void toplama(int sayi)
    {       
        if (sayi == 0)
        {
            System.out.println(toplam);
            return;
        }
        
        toplam+=sayi;       
        toplama(sayi-1);
    }
}

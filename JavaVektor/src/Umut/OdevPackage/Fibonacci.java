package Umut.OdevPackage;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("Fibonacci dizisinin uzunlugu giriniz: ");
int fb=scan.nextInt();
int sonuc=fibona(fb);
System.out.println("Fibonacci sonucu = "+sonuc);
}

    
    
    static int fibona(int x) {
if (x <= 1) {
return x;
}
else {
return fibona(x-1) + fibona(x-2); 
}
}
 
   
    
    
}

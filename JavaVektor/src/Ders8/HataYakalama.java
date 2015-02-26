package Ders8;

import javax.swing.JOptionPane;

public class HataYakalama {
    static int carpim=1;
    public static void main(String[] args) {
        
        rekursifFonk(4);
        System.out.println(carpim);
    }
    private static void rekursifFonk(int sayi){
     if(sayi==1)
         return;
     carpim=carpim*sayi;
     rekursifFonk(sayi-1);
    }
    private void hataYaklama(){
    int a = Integer.valueOf("12");
        try {
            int b = Integer.valueOf("D");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return;
        }
        finally{
            System.out.println("Bitti");
        }
        System.out.println("Deneme");
    }
}

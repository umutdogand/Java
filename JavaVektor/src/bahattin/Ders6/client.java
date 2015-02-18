/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bahattin.Ders6;

/**
 *
 * @author vektorel
 */
public class client {
    public static void main(String[] args) {
        muhendis mhdis = new muhendis(5, "Mustafa" , "Ergan" , 30);
        mhdis.maashesapla();  
        docent dc = new docent("Ahmet","Güneş",40);
        dc.maashesapla();
        profesor prf = new profesor("Mehmet","Büken",55);
        prf.maashesapla();
        teknisyen tk = new teknisyen("Hasan","Gündüz",22);
        tk.maashesapla();
    }
}

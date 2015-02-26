
package Umut.ders8;


public class Ogrenci {
    
    private String name;
    private String surname; 
    private int TC;
    private String bolum;

    public String getBolum() {
        return bolum;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
     
   
    public Ogrenci(String name, String surname,String bolum ,int yas) {
        this.name = name;
        this.surname = surname;
        this.TC = TC;
        this.bolum=bolum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    
}

package Ders13KutupHanePojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONEL")
public class PersonelPojo {

    private int id;
    private String adi;
    private String soyad;
    private String gorev;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personel_id_seq")
    @SequenceGenerator(name = "personel_id_seq", sequenceName = "personel_id_seq", allocationSize = 1, initialValue = 10)
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "ADI", length = 50)
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Column(name = "SOYADI", length = 50)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "GOREV", length = 50)
    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

}

package Ders13KutupHanePojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PERSONEL")
public class PersonelPojo {

    private int id;
    private String adi;
    private String soyad;
    private String gorev;
    private String TC;
    private Date Dogum_Tarihi;
    private String Cinsiyeti;

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

    @Column(name = "TC", length = 11)
    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Dogum_Tarihi")
    public Date getDogum_Tarihi() {

        return Dogum_Tarihi;
    }

    public void setDogum_Tarihi(Date Dogum_Tarihi) {
        this.Dogum_Tarihi = Dogum_Tarihi;
    }

    @Column(name = "Cinsiyeti", length = 10)
    public String getCinsiyeti() {
        return Cinsiyeti;
    }

    public void setCinsiyeti(String Cinsiyeti) {
        this.Cinsiyeti = Cinsiyeti;
    }

}

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
@Table(name = "KITAP_TBL")

public class KitapPojo {

     private int id;
     private String adi;
     private String yazari;
//     private String kodu;
     private Date yayinTarihi;
     private int baski;
     private String rafNo;
//     int aranmaSayisi;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "kitap_id_seq")
    @SequenceGenerator(name = "kitap_id_seq", sequenceName = "kitap_id_seq", allocationSize = 1,initialValue = 10)
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

    @Column(name = "YAZARI", length = 50)
    public String getYazari() {
        return yazari;
    }
    public void setYazari(String yazari) {
        this.yazari = yazari;
    }
//
//    @Column(name = "KITAP_KODU", length = 50)
//    public String getKodu() {
//        return kodu;
//    }
//    public void setKodu(String kodu) {
//        this.kodu = kodu;
//    }
//
    @Temporal(TemporalType.DATE)
    @Column(name = "YAYIN_TARIHI")
    public Date getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(Date yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }
//
    @Column(name = "BASKI", length = 50)
    public int getBaski() {
        return baski;
    }

    public void setBaski(int baski) {
        this.baski = baski;
    }
//
    @Column(name = "RAF_NO", length = 50)
    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }
//
//    @Column(name = "ARANMA_SAYISI", length = 50)
//    public int getAranmaSayisi() {
//        return aranmaSayisi;
//    }
//
//    public void setAranmaSayisi(int aranmaSayisi) {
//        this.aranmaSayisi = aranmaSayisi;
//    }
}

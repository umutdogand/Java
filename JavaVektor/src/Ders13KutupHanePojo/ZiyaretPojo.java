

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
@Table(name = "ZIYARET_TBL")

public class ZiyaretPojo {
    private int id;
    private String adi;
    private String Soyadi;
    private String TC;
    private Date ZiyaretTarih;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ziyaret_id_seq")
    @SequenceGenerator(name = "ziyaret_id_seq", sequenceName = "ziyaret_id_seq", allocationSize = 1, initialValue = 10)
    @Column(name = "ID", length = 20)
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
    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String Soyadi) {
        this.Soyadi = Soyadi;
    }

    @Column(name = "TC", length = 50)
    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Ziyaret_Tarih")
    public Date getZiyaretTarih() {
        return ZiyaretTarih;
    }

    public void setZiyaretTarih(Date ZiyaretTarih) {
        this.ZiyaretTarih = ZiyaretTarih;
    }
        
      
}

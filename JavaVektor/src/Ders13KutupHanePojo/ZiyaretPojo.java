

package Ders13KutupHanePojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ZiyaretPojo {
    private String adi;
    private String Soyadi;
    private String TC;
    private Date ZiyaretTarih;

    
    @Column(name = "ADI", length = 50)
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Column(name = "SOYADI", length = 50)
    public String getSoyadı() {
        return Soyadi;
    }

    public void setSoyadı(String Soyadi) {
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

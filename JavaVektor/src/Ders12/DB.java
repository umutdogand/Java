package Ders12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DB {

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hbs", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        System.out.println("Baglantı Başarılı");
        return con;
    }

    public int islemlerFunction(String sorgu) {
        Connection con = null;
        Statement st = null;
        int etkilenenKayit = 0;
        try {
            con = getConnection();
            st = con.createStatement();
            etkilenenKayit = st.executeUpdate(sorgu);
        } catch (Exception e) {
            return 0;
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return etkilenenKayit;
    }

    public Map<Integer, String> getDegerId(String sorgu) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            while (rs.next()) {
                map.put(rs.getInt("Id"), rs.getString("Deger"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }
    
    public Map<Integer, Hasta> getHasta(String sorgu) {
        Map<Integer, Hasta> hastaMap = new HashMap<Integer, Hasta>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            Hasta hasta;
            while (rs.next()) {
                hasta = new Hasta();
                hasta.id = rs.getInt("Id");
                hasta.adi = rs.getString("Adi");
                hasta.tc = rs.getString("Tc");
                hasta.soyadi = rs.getString("Soyadi");
                hasta.cinsiyet = rs.getString("Cinsiyet");
                hasta.kangrubu   = rs.getString("Kan_Grubu");
                hasta.bolum = rs.getString("Bolum");
                hastaMap.put(rs.getInt("Id"), hasta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hastaMap;
    }
}

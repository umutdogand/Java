/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vektorel
 */
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema", "root", "");

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

    public ResultSet selectFunc(String sorgu) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        Map<Integer, String> map = new HashMap<Integer, String>();
        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            return null;
//            while (rs.next()) {
//                map.put(rs.getInt("id"), rs.getString("Adi"));
//            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                rs.close();
                st.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public Map<Integer, String> getGorev() {
        Map<Integer, String> personelMap = new HashMap<Integer, String>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery("Select * from personelgorev");
            while (rs.next()) {
                personelMap.put(rs.getInt("Id"), rs.getString("Deger"));
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
        return personelMap;
    }

    public Map<Integer, Personel> getPersonel(String sorgu) {
        Map<Integer, Personel> personelMap = new HashMap<Integer, Personel>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            Personel pers;
            while (rs.next()) {
                pers = new Personel();
                pers.id = rs.getInt("Id");
                pers.ad = rs.getString("Adi");
                pers.soyad = rs.getString("Soyadi");
                pers.gorev = rs.getString("Gorev");
                pers.tc = rs.getString("Tc");
                pers.cinsiyet = rs.getString("Cinsiyet");
                personelMap.put(rs.getInt("Id"), pers);
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
        return personelMap;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Umut.ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public Map<Integer, String> selectFunc(String sorgu) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        Map<Integer, String> map = new HashMap<Integer, String>();
        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            while (rs.next()) {
                map.put(rs.getInt("id"), rs.getString("Adi"));
            }
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
        return map;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAMZEders10;

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
public class DB 
{

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OGRENCI", "root", "");

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
                map.put(rs.getInt("id"), rs.getString("ADI"));
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
    
    public Map<Integer,String> getGorev() 
    {
        Map<Integer,String> personelMap = new HashMap<Integer,String>();
        Connection con = null; //veritabanı uygulama arası yol açar.
        Statement st = null; //execute yapmamızı sağlar.
        ResultSet rs = null;
        try
        {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from personel_görev");
            while( rs.next() ) //null gelene kadar satırları al
            {
                personelMap.put(rs.getInt("id"), rs.getString("GÖREV"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                con.close();
            }
            catch(Exception e)
            {
            }          
        }
        return personelMap;
    }
    
    public Map<Integer,Personel> getPersonel(String sorgu) //Personel class'ının adı
    {
        Map<Integer,Personel> personelMap = new HashMap<Integer,Personel>();
        Connection con = null; //veritabanı uygulama arası yol açar.
        Statement st = null; //execute yapmamızı sağlar.
        ResultSet rs = null;
        try
        {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sorgu);
            Personel pers;
            while( rs.next() ) //null gelene kadar satırları al
            {
                pers = new Personel();
                pers.id = rs.getInt("ID");
                pers.ad = rs.getString("AD");
                pers.soyad = rs.getString("SOYAD");
                pers.tc = rs.getString("TC");
                pers.gorev = rs.getString("GÖREV");
                pers.cinsiyet = rs.getString("CINSIYET");
                personelMap.put(rs.getInt("id"), pers);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                rs.close();
                st.close();
                con.close();
            }
            catch(Exception e)
            {
            }          
        }
        return personelMap;
    }
}
    


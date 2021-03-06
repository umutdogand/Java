/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Adil.Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DB {
     public Connection getConnection(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            
        }
            Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbsders", "root", "");
        } catch (Exception e) {
        }
        return con;
    }
    public int insertFun(String sorgu){
        Connection con=null;
        Statement st=null;
        int etkilenenKayit=0;
      
        try {
            con=getConnection();
            st=con.createStatement();
            etkilenenKayit=st.executeUpdate(sorgu);
        } catch (Exception e) {
            return 0;
        }
   return etkilenenKayit;
    }
    public Map<Integer, String> selectFunc() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        Map<Integer, String> map = new HashMap<Integer, String>();
        String sql = "select id,adi from Ogrenci";
        try {
            con = getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                map.put(rs.getInt("id"), rs.getString("Adi"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
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

   public Map<Integer, String> getGorev(){
       Map<Integer, String> PersonelMap=new HashMap<Integer, String>();
       Connection con=null;
       Statement st=null;
       ResultSet rs=null;
       try {
           con=getConnection();
           st=con.createStatement();
           rs=st.executeQuery("Select * from Gorev");
           while(rs.next()){
               PersonelMap.put(rs.getInt("id"), rs.getString("Deger"));
           }
       } catch (Exception e) {
           e.printStackTrace();
       }finally{
           try {
               rs.close();
               st.close();
               con.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
          
       }
       return PersonelMap;
   }
   
   public Map<Integer, Personel> getPersonel(String sorgu){
       Map<Integer, Personel> PersonelMap=new HashMap<Integer, Personel>();
       Connection con=null;
       Statement st=null;
       ResultSet rs=null;
       try {
           con=getConnection();
           st=con.createStatement();
           rs=st.executeQuery(sorgu);
           Personel pr;
           while(rs.next()){
              pr=new Personel();
              pr.id=rs.getInt("id");
              pr.Ad=rs.getString("Ad");
              pr.Soyad=rs.getString("Soyad");
              pr.Gorev=rs.getString("Gorev");
              pr.Tc=rs.getString("tc");
              pr.Cinsiyet=rs.getString("Cinsiyet");
              PersonelMap.put(rs.getInt("id"), pr);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }finally{
           try {
               rs.close();
               st.close();
               con.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
          
       }
       return PersonelMap;
   }
}

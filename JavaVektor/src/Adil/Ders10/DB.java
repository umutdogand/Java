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

   
}

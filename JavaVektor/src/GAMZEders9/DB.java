/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GAMZEders9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author vektorel
 */
public class DB 
{
    public Connection getConnection() 
    {
        Connection con = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return null;
        }
        
        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcders1", "root", ""); //kendi veritabanı adresimizi gösterdik. localhost yerine 127.0.0.1 de yazabilirdik; kendi bilgisayarımızı gösterme amacıyla.
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return null;
        }
        System.out.println("Baglantı Başarılı");
        return con;
    }
    
    public int insertFunction()
    {
        Connection con = null;
        Statement st = null;
        int etkilenenKayit=0;
        String sql = "insert into new_table(id,ADI,SOYADI) values(1,\"Umut\",\"Dogan\")";
        try 
        {
            con = getConnection();
            st = con.createStatement();
            etkilenenKayit = st.executeUpdate(sql);
        } 
        catch (Exception e)
        {
            return 0;
        }
        return etkilenenKayit; 
    }
}
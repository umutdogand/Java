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
            Class.forName("com.mysql.jdbc.Driver"); // hangi veritabanını kullanıyorsak onun driver ının bulunduğu paketi yazıyoruz. internetten bak. biz mysql kullanıyoruz.

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return null;
        }
        
        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcders1", "root", ""); //kendi veritabanı adresimizi gösterdik. localhost yerine 127.0.0.1 de yazabilirdik; kendi bilgisayarımızı gösterme amacıyla. JDBC URL formata göre ekliyoruz.
        } 
        catch (Exception e) 
        {
            e.printStackTrace();//hatayı ekrana yazdır.
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
        String sql = "insert into new_table(id,ADI,SOYADI) values(1,\"Umut\",\"Dogan\")"; //sql sorgusu
        try 
        {
            con = getConnection();
            st = con.createStatement(); // veritabanı ile bilgi alışverişi için statement oluşturduk.
            etkilenenKayit = st.executeUpdate(sql);
        } 
        catch (Exception e)
        {
            return 0;
        }
        return etkilenenKayit; 
    }
}
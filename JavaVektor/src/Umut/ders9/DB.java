package Umut.ders9;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {

    public Connection getConnect() {
       Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first-u", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        System.out.println("Baglantı Başarılı");
        return con;
    }

    public int insertFunc() {
        Connection con=null;
    Statement st=null;
    int etkilenenKayit=0;
    String sql="insert into deneme(id,adi) values(130,\"Umut\")";
        try {
            con=getConnect();
            st=con.createStatement();
            etkilenenKayit=st.executeUpdate(sql);
        } catch (Exception e) {
            return 0;
        }
   return etkilenenKayit;
    }
    
    
    

}

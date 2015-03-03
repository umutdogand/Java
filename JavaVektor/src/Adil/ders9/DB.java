
package Adil.ders9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



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
    public int insertFun(){
        Connection con=null;
        Statement st=null;
        int etkilenenKayit=0;
        String sql="insert into ders1(id,AD) values(1,\"Adil\")";
        try {
            con=getConnection();
            st=con.createStatement();
            etkilenenKayit=st.executeUpdate(sql);
        } catch (Exception e) {
            return 0;
        }
   return etkilenenKayit;
    }
}

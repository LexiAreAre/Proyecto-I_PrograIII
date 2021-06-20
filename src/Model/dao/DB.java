package Model.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB {
    public static Connection getConnection(){
        try{
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/database";
            String username = "Admin";
            String password = "Contra";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println(" ");
            return conn;
        }catch(Exception ex){
            System.out.println(" ");
        }
        return null;
    }
}

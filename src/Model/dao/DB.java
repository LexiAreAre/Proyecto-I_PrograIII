package Model.dao;
import java.sql.*;

public class DB {
    static final String Driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/DATABASE";
    static final String username = "root";
    static final String password = "Contra";

    public static Connection getConnection(){
        Connection conn = null;
        Statement st = null;

        try{
            Class.forName(Driver);
            conn = DriverManager.getConnection(url,username,password);
            System.out.println(" ");
            st = conn.createStatement();
            String sql = "CREATE TABLE DATABASE" +
                         "(id INTEGER not null," +
                         "first VARCHAR(255)," +
                         "last VARCHAR(255)," +
                         "age INTEGER, "+
                         "PRIMARY KEY(id))";
            st.executeUpdate(sql);
            return conn;
        } catch(Exception ex){
            ex.printStackTrace();
        } finally{
            try{
                if(st!=null)
                    conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        try{
            if(conn!=null)
                conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
/*
    public static void createTable()throws Exception{
        try{
            Connection connection = getConnection();
            PreparedStatement create = connection.prepareStatement("CREATE TABLE IF NOT EXISTS databaseProject(id int NOT NULL AUTO_INCREMENT,first varchar(255), last (255), PRIMARY KEY(id))");
            create.executeUpdate();
        }catch(Exception ex){System.out.println(ex);}
        finally{System.out.print("Ready");}
    }*/

}

package Model.dao;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class DB extends MysqlDataSource {
    static final String Driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/mydb";
    static final String username = "root";
    static final String password = "";


    private static DB theInstance;
    public static final String PROPERTIES_FILE_NAME="/db.properties";
    private static Connection cnx;

    public static DB instance(){
        if (theInstance==null){
            theInstance=new DB();
        }
        return theInstance;
    }

    public DB(){
        //System.out.println("Prueba 1");
        cnx=this.getConnection();
    }

    public Connection getConnection() {
        try {
            Class.forName(Driver);
            /*cnx = */DriverManager.getConnection(url,username,password);
            //return cnx;
            return DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(-1);
            return null;
        }
    }

    public static Connection conect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");
        } catch (Exception exception) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, exception);
        }
        return conn;
    }

    public static void closeCnx()throws SQLException {
        if(cnx != null){
            cnx.close();
        }
    }

    public PreparedStatement prepareStatement(String statement) throws SQLException {
        return cnx.prepareStatement(statement);
    }

    public int executeUpdate(PreparedStatement statement) {
        try {
            statement.executeUpdate();
            return statement.getUpdateCount();
        } catch (SQLException ex) {
            return 0;
        }
    }




}

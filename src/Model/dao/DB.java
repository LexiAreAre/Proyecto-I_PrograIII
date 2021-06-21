package Model.dao;
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
public class DB /*extends MysqlDataSource*/ {
    static final String Driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/mysql";
    static final String username = "root";
    static final String password = "Contra";

/*
    private static DB theInstance;
    public static final String PROPERTIES_FILE_NAME="/db.properties";
    private Connection cnx;

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
            Properties prop = new Properties();
            URL resourceUrl = getClass().getResource(PROPERTIES_FILE_NAME);
            File file = new File(resourceUrl.toURI());
            prop.load(new BufferedInputStream(new FileInputStream(file)));
            String driver = prop.getProperty("database_driver");
            String server = prop.getProperty("database_server");
            String port = prop.getProperty("database_port");
            String user = prop.getProperty("database_user");
            String password = prop.getProperty("database_password");
            String database = prop.getProperty("database_name");
            String ssl= prop.getProperty("ssl");
            String URL_conexion="jdbc:mysql://"+ server+":"+port+"/"+
                    database+"&user="+user+"&password="+password+"&serverTimezone=UTC";
            Class.forName(driver).newInstance();

            System.out.println("Database: Database inicializada");
            return DriverManager.getConnection(URL_conexion);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(-1);
        }
        return null;
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
    public ResultSet executeQuery(PreparedStatement statement){
        try {
            return statement.executeQuery();
        } catch (SQLException ex) {
        }
        return null;
    }

*/






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

package Model.dao;
import Model.User;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO implements UserDAO_Interface{
    private DB db = new DB();
    static final String UPDATE = "USERNAME = ?, PASSWORD = ?;";

    @Override
    public boolean create(User u) {
        boolean resul = false;
        try{
            Connection conn = DB.conect();
            String query = "insert into mydb.user(id, username, password) values (?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,"0");
            preparedStatement.setString(2,u.getUsername());
            preparedStatement.setString(3,u.getPassword());
            resul=preparedStatement.execute();

        }catch(Exception ex){
            System.err.println("Got an exception! ");
            System.err.println(ex.getMessage());
        }
        return resul;
    }

    @Override
    public ResultSet read() {
        try{
            Statement statement = db.getConnection().createStatement();
            String query = "SELECT * FROM users";
            return statement.executeQuery(query);

        }catch(Exception exception){
            return null;
        }
    }

    @Override
    public boolean update(User u) throws SQLException{
        boolean updated;
        try(Connection connection = db.getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE)){
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());
            updated = statement.executeUpdate() > 0;
        }
        return updated;
    }

    @Override
    public void delete(User u) {

    }

    public static void consulta(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM mydb.users;");
            while (rs.next()) {
                String name = rs.getString("username");
                System.out.println(name);
            }

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }


}

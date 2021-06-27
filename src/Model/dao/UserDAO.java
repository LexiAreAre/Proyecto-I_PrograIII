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
        return false;
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
        try(Connection connection = db.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE)){
            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());
            updated = statement.executeUpdate() > 0;
        }
        return updated;
    }

    @Override
    public boolean delete(User u) {
        return false;
    }
}

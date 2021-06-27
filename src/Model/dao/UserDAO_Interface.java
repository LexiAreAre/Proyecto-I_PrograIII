package Model.dao;
import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserDAO_Interface {
    public boolean create(User u);
    public ResultSet read();
    public boolean update(User u) throws SQLException;
    public void delete(User u);
}

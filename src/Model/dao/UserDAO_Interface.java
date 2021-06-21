package Model.dao;
import Model.User;

import java.sql.ResultSet;

public interface UserDAO_Interface {
    public boolean create(User u);
    public ResultSet read();
    public boolean update(User u);
    public boolean delete(User u);
}

package Model.dao;
import Model.User;

public interface UserDAO_Interface {
    public boolean create(User u);
    public boolean read(User u);
    public boolean update(User u);
    public boolean delete(User u);
}

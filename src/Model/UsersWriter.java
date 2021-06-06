package Model;
import java.io.FileWriter;
import java.io.IOException;
import Model.User;
public class UsersWriter implements JavaWriter{
    private User user;
    @Override
    public void write() {
        try {
            FileWriter writer = new FileWriter("Users.txt", true);
            writer.write(user.getUsername());
            writer.write(user.getPassword());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

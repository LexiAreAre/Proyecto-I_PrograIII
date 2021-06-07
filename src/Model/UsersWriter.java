package Model;

import java.io.FileWriter;
import java.io.IOException;

public class UsersWriter implements JavaWriter{

    private User user;
    @Override

    public void write() {
           user=new User("admi2","123");
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

package Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.FileReader;
import java.io.IOException;
public class UsersReader implements JavaReader {

    StringBuilder admi = new StringBuilder();

    @Override

    public void read() {
        try {
            FileReader reader = new FileReader("src/Registry/Users.txt");
            int character;

            while ((character = reader.read()) != -1) {
                admi.append((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkUsers(String n, String p) {
        read();

        boolean name = admi.toString().contains("username/" + n + "/username");
        boolean pass = admi.toString().contains("password/" + p + "/password");

        if (n.isBlank() || p.isBlank()) {
            return false;
        } else if (name && pass) {
            return true;
        }
        else{
            return false;
        }
    }
    }
package Model;

import java.io.FileReader;
import java.io.IOException;
public class UsersReader implements JavaReader{
    @Override
    public void read() {
        try {
            FileReader reader = new FileReader("Users.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkUsers(){

    }
}

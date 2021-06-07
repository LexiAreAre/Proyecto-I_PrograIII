package Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.FileReader;
import java.io.IOException;
public class UsersReader implements JavaReader {

    String admi;

    @Override

    public void read() {
        try {
            FileReader reader = new FileReader("Users.txt");
            int character;

            while ((character = reader.read()) != -1) {
                admi +=(char) character;
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkUsers(String n, String p) {
        read();
        boolean name= admi.contains(n);
      boolean pass=   admi.contains(p);
      admi.contains(n);

      if(n=="''"&& p=="''"){
          return false;

      }
     if(name ==true && pass ==true  ){
         return true;
     }


        else{
            return false;
        }
    }
    }

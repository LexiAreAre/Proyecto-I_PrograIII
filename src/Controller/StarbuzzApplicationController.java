package Controller;

import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StarbuzzApplicationController {

    @FXML
    private Button exitButton;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void onExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void onLogin() {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../View/StarbuzzApplicationCoffee.fxml"));
            AnchorPane window = loader.load();
            Scene scene = new Scene(window);
            Main.current.hide();
            Main.current.setScene(scene);
            Main.current.setResizable(false);
            Main.current.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

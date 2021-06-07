package Controller;
import javax.swing.JOptionPane;
import Model.Main;
import Model.UsersReader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


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

        // check users
        UsersReader read = new UsersReader();
        if ( read.checkUsers(usernameField.getText(), passwordField.getText()) ) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("../View/StarbuzzApplicationCoffee.fxml"));
                AnchorPane window = loader.load();
                Scene scene = new Scene(window);
                Main.current.hide();
                Main.current.setScene(scene);
                Main.current.setResizable(false);
                Main.current.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor revice los campos de usuario y contrasenna");
        }
    }
}

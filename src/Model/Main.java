package Model;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    public static void main(String[] args){
        try{
            launch(args);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../View/StarbuzzApplication.fxml"));
        AnchorPane window = loader.load();
        Scene scene = new Scene(window);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}

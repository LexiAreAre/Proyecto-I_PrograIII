package Model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    // current will be the only stage in all program's life
    public static Stage current = null;

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
        current = stage;
        current.setScene(scene);
        current.setResizable(false);
        current.setTitle("Starbuzz Application");
        current.show();
    }
}

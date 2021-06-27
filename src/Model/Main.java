package Model;

import Model.dao.UserDAO;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.sql.ResultSet;

public class Main extends Application {

    // current will be the main stage on the application for the login and the main menu
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
//        UserDAO dao = new UserDAO();
//        ResultSet resultSet = dao.read();
//        if(resultSet!=null){
//         while(resultSet.next()){
//             System.out.println(resultSet.getString("username"));
//         }
//        }
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

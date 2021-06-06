package Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SystemBeverage {

    public static ArrayList<Beverage> beverages = new ArrayList<>();

    public static void addTopings(Beverage beverage)
    {
        // showing toppings window
        Stage stage = new Stage();
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../View/ToppingsWindow.fxml"));
            AnchorPane window = loader.load();
            Scene scene = new Scene(window);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        // saving the beverage in the arraylist
        beverages.add(beverage);
    }

    public static String generateInvoice(){
        StringBuilder bill = new StringBuilder();
       Invoice v = new Invoice(beverages);
        return v.printBill();
    }

}

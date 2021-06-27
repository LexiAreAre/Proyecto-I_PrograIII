package Model;
// This class will be in charge of connecting the menu choises of the toppings and generating the respective invoice each time a new order is generated in the application...
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class SystemBeverage {

    //container for all beverages while creating an order, this will be cleaned once the print bill button is pressed.
    public static ArrayList<Beverage> beverages = new ArrayList<>();

    public static String addTopings()
    {
        // showing toppings window
        Stage stage = new Stage();
        try{
            //Creating side window for toppings
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../View/ToppingsWindow.fxml"));
            AnchorPane window = loader.load();
            Scene scene = new Scene(window);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.showAndWait();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return getBeveragesDescription();
    }

    public static String generateInvoice(){
        StringBuilder bill = new StringBuilder();
       Invoice v = new Invoice(beverages);
        return v.printBill();
    }

    public static String getBeveragesDescription()
    {
        StringBuilder desc = new StringBuilder();
        int i = 0;
        for (Beverage x: beverages
             ) {
            desc.append('\n' + x.getDescription() + "\n" + x.getCost());
            i += x.getCost();
        }
        desc.append("\nTotal:\t" + i);
        desc.append('\n' + "---   fin de linea   ---");
        return desc.toString();
    }

    public static String editBilling(){
        try{
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../View/ModuleController.fxml"));
            AnchorPane window = loader.load();
            Scene scene = new Scene(window);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.showAndWait();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return getBeveragesDescription();
    }
}

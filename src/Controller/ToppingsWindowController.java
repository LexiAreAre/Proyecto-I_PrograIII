package Controller;


import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ToppingsWindowController {
    @FXML
    private Button caramelButton;

    @FXML
    private Button mokaButton;

    @FXML
    private Button soyButton;

    @FXML
    private Button milkFoamButton;

    @FXML
    private Button goBackButton;

    @FXML
    private Button showBillButton;

    @FXML
    void onCaramelPressed(ActionEvent event) {
        Caramel beverageWithCaramel = new Caramel(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithCaramel);
    }

    @FXML
    void onGoBackAction(ActionEvent event) {
        Stage stage = (Stage) goBackButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onMilkFoamPressed(ActionEvent event) {
        Milk_Foam beverageWithMilk_Foam = new Milk_Foam(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithMilk_Foam);
    }

    @FXML
    void onMokaPressed(ActionEvent event) {
        Moka beverageWithMoka = new Moka(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithMoka);
    }

    @FXML
    void onShowBillAction(ActionEvent event) {
        // window.close()
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Factura");
        alert.setHeaderText(null);
        alert.setContentText(SystemBeverage.generateInvoice());
        alert.showAndWait();
    }

    @FXML
    void onSoyPressed(ActionEvent event) {
        Soy beverageWithSoy = new Soy(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithSoy);
    }
}

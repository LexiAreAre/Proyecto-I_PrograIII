package Controller;


import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;


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
    private ScrollPane orderSummary;

    @FXML
    private TextArea orderSummaryText;

    private void updateOrderSummary(Beverage b, String topping){
        if(orderSummaryText.getText().isEmpty()){
            orderSummaryText.setText("Added " + topping + " to: " + b.getDescription());
        }
        else{
            orderSummaryText.setText(orderSummaryText.getText() + "\nAdded " + topping + " to: " + b.getDescription());
        }
    }

    @FXML
    void onCaramelPressed(ActionEvent event) {
        updateOrderSummary(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1), "Caramel");
        Caramel beverageWithCaramel = new Caramel(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithCaramel);
        caramelButton.setDisable(true);
    }

    @FXML
    void onGoBackAction(ActionEvent event) {
        Stage stage = (Stage) goBackButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onMilkFoamPressed(ActionEvent event) {
        updateOrderSummary(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1), "Milk Foam");
        Milk_Foam beverageWithMilk_Foam = new Milk_Foam(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithMilk_Foam);
        milkFoamButton.setDisable(true);
    }

    @FXML
    void onMokaPressed(ActionEvent event) {
        updateOrderSummary(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1), "Moka");
        Moka beverageWithMoka = new Moka(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithMoka);
        mokaButton.setDisable(true);
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
        updateOrderSummary(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1), "Soy");
        Soy beverageWithSoy = new Soy(SystemBeverage.beverages.get(SystemBeverage.beverages.size()-1));
        SystemBeverage.beverages.remove(SystemBeverage.beverages.size()-1);
        SystemBeverage.beverages.add(beverageWithSoy);
        soyButton.setDisable(true);
    }
}

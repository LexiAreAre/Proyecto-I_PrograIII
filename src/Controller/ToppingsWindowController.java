package Controller;


import Model.Caramel;
import Model.SystemBeverage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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

    }

    @FXML
    void onMilkFoamPressed(ActionEvent event) {

    }

    @FXML
    void onMokaPressed(ActionEvent event) {

    }

    @FXML
    void onShowBillAction(ActionEvent event) {

    }

    @FXML
    void onSoyPressed(ActionEvent event) {

    }
}

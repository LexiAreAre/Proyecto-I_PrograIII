package Controller;

import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class StarbuzzApplicationControllerCoffee {
    @FXML
    private Button printBillButton;

    @FXML
    private Button exitMainButton;

    @FXML
    private AnchorPane anPa;

    @FXML
    private Button espressoButton;

    @FXML
    private Button darkRoastButton;

    @FXML
    private Button decafButton;

    @FXML
    private Button houseBlendButton;

    @FXML
    void onDarkRoastSelection(ActionEvent event) {
        Model.SystemBeverage.addTopings(new Dark_Roast());
    }

    @FXML
    void onDecafSelection(ActionEvent event) {
        Model.SystemBeverage.addTopings(new Decaf());
    }

    @FXML
    void onEspressoSelection(ActionEvent event) {
        Model.SystemBeverage.addTopings(new Expresso());
    }

    @FXML
    void onHouseBlendSelection(ActionEvent event) {
        Model.SystemBeverage.addTopings(new House_Blend());
    }

    @FXML
    void onPrintBillAction(ActionEvent event) {
        //showing all requested beverages bill
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Factura");
        alert.setHeaderText(null);
        alert.setContentText(SystemBeverage.generateInvoice());
        alert.showAndWait();
        //saving the bill's information to a txt

        //cleaning the vector in order to get newer requests
        SystemBeverage.beverages.clear();
    }
    @FXML
    void onExitMain(ActionEvent event) { System.exit(0);}

}

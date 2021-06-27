package Controller;

import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private TextArea billOverview;


    @FXML
    private Button editBillButton;

    @FXML
    void onDarkRoastSelection(ActionEvent event) {
        // saving the beverage in the arraylist
        SystemBeverage.beverages.add(new Dark_Roast());
        billOverview.setText(SystemBeverage.getBeveragesDescription());
        billOverview.setText(Model.SystemBeverage.addTopings());
    }

    @FXML
    void onDecafSelection(ActionEvent event) {
        SystemBeverage.beverages.add(new Decaf());
        billOverview.setText(SystemBeverage.getBeveragesDescription());
        billOverview.setText(Model.SystemBeverage.addTopings());
    }

    @FXML
    void onEspressoSelection(ActionEvent event) {
        SystemBeverage.beverages.add(new Expresso());
        billOverview.setText(SystemBeverage.getBeveragesDescription());
        billOverview.setText(Model.SystemBeverage.addTopings());
    }

    @FXML
    void onHouseBlendSelection(ActionEvent event) {
        SystemBeverage.beverages.add(new House_Blend());
        billOverview.setText(SystemBeverage.getBeveragesDescription());
        billOverview.setText(Model.SystemBeverage.addTopings());
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
        BillWriter writer = new BillWriter();
        writer.setInvoice(SystemBeverage.beverages);
        writer.write();
        //cleaning the vector in order to get newer requests
        SystemBeverage.beverages.clear();
    }
    @FXML
    void onExitMain(ActionEvent event) { System.exit(0);}

    @FXML
    void onEditBill(ActionEvent event) {
        billOverview.setText(SystemBeverage.editBilling());
        billOverview.setText(SystemBeverage.getBeveragesDescription());
    }

}

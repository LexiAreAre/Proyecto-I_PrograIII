package Controller;

import Model.Dark_Roast;
import Model.Decaf;
import Model.Expresso;
import Model.House_Blend;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class StarbuzzApplicationControllerCoffee {
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

}

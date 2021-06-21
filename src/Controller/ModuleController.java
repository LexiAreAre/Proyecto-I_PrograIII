package Controller;

import Model.Beverage;
import Model.SystemBeverage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ModuleController implements Initializable {

    @FXML
    private TextArea billOvervire;

    @FXML
    private TextField beverageSelected;

    @FXML
    private Button deleteBeverageButton;

    @FXML
    void onDeleteBeverage(ActionEvent event) {
        try{
            int selection = Integer.valueOf(beverageSelected.getText());
            SystemBeverage.beverages.remove(selection - 1);
            prepareBill();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "El valor ingresado no corresponde a una bebida en la factura");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        prepareBill();
    }

    public void prepareBill()
    {
        StringBuilder currentBill = new StringBuilder();
        int i = 1;
        for (Beverage x: SystemBeverage.beverages
        ) {
            currentBill.append(String.valueOf(i) + ") ");
            currentBill.append(x.getBaseName());
            currentBill.append(x.getToppings());
            currentBill.append(x.getCost());
        }
        billOvervire.setText(currentBill.toString());
    }
}

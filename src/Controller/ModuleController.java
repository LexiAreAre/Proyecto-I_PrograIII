package Controller;

import Model.BeverageModel;
import Model.SystemBeverage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.net.URL;
import java.util.*;

public class ModuleController implements Initializable {

    List<BeverageModel> list = new ArrayList<>();


    @FXML
    private TableView<BeverageModel> view;

    @FXML
    private TableColumn<BeverageModel, String> baseNameColumn;

    @FXML
    private TableColumn<BeverageModel, String> toppingsColumn;

    @FXML
    private TableColumn<BeverageModel, String> priceColumn;

    @FXML
    private TableView<?> previousBillsSummary;

    @FXML
    private Button deleteRowButton;

    @FXML
    void onExitBillEditingAction(ActionEvent event) {
        Stage stage = (Stage) exitBillViewButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private Button exitBillViewButton;

    @FXML
    void onDeleteRowAction(ActionEvent event) {
        try{
            for (int i = 0; i < list.size(); i++){
                if (view.getSelectionModel().getSelectedItem().getName().equals(list.get(i).getName()) && view.getSelectionModel().getSelectedItem().getToppings().equals(list.get(i).getToppings())){
                    SystemBeverage.beverages.remove(i);
                    list.remove(i);
                }
            }
            view.getItems().removeAll(view.getSelectionModel().getSelectedItem());

        } catch (Exception e){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Sin Seleccion");
            errorAlert.setContentText("No se ha elegido un elemento a borrar o la tabla esta vacia.");
            errorAlert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for (int i = 0; i < SystemBeverage.beverages.size(); i ++){
            list.add(new BeverageModel(SystemBeverage.beverages.get(i)));
        }


        for (int i = 0; i < list.size(); i++) {
            view.getItems().add(list.get(i));
        }

        baseNameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        toppingsColumn.setCellValueFactory(new PropertyValueFactory<>("Toppings"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("Price"));

    }

}

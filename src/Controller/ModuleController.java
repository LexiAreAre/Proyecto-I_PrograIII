package Controller;

import Model.Beverage;
import Model.SystemBeverage;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ModuleController implements Initializable {

    @FXML
    private TableView<String> view;

    @FXML
    private TableColumn<String, String> invoiceColumn;

    @FXML
    private TableColumn<String, String> beverageColumn;

    @FXML
    private TableColumn<String, String> toppingColumn;

    @FXML
    private TableColumn<String, String> priceColumn;

    @FXML
    private TableColumn<String, String> previousBillNumberColumn;

    @FXML
    private TableColumn<String, String> showPreviousBillColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> beverageName = new ArrayList<>();
        for (Beverage x: SystemBeverage.beverages
             ) {
            beverageName.add(x.getBaseName());
        }
        beverageColumn.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue()));
        ObservableList<String> data = FXCollections.observableArrayList((List) (beverageName));
        view.setItems(data);

    }
}

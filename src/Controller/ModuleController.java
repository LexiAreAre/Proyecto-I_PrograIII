package Controller;

import Model.Beverage;
import Model.Invoice;
import Model.SystemBeverage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ModuleController{
    @FXML
    private TableView<Beverage> view;

    @FXML
    private TableColumn<Invoice, Invoice> invoiceColumn;

    @FXML
    private TableColumn<Beverage, Beverage> beverageColumn;

    @FXML
    private TableColumn<Beverage, Beverage> toppingColumn;

    @FXML
    private TableColumn<Beverage, Beverage> priceColumn;

    private ObservableList<Beverage> orders = FXCollections.observableArrayList(SystemBeverage.beverages);

}

package Controller;

import Model.Beverage;
import Model.Invoice;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ModuleController{
    @FXML
    private TableView<Beverage> view;

    @FXML
    private TableColumn<Invoice, Invoice> invoice;

    @FXML
    private TableColumn<Beverage, Beverage> beverage;

    @FXML
    private TableColumn<Beverage, Beverage> topping;

    @FXML
    private TableColumn<Beverage, Beverage> price;

}

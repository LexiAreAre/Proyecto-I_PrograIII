package Model;

import javafx.beans.property.SimpleStringProperty;

public class InvoiceModel {
    private final SimpleStringProperty Product = new SimpleStringProperty();
    private final SimpleStringProperty Description = new SimpleStringProperty();

    public InvoiceModel(String name, String desc){
        Product.setValue(name);
        Description.setValue(desc);
    }

    public String getProduct(){
        return Product.toString();
    }

    public String getDescription(){
        return Description.toString();
    }
}

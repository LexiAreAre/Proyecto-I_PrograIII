package Model;

import javafx.beans.property.SimpleStringProperty;

public class BeverageModel {
    private final SimpleStringProperty NameProperty = new SimpleStringProperty();
    private final SimpleStringProperty ToppingsProperty = new SimpleStringProperty();
    private final SimpleStringProperty PriceProperty = new SimpleStringProperty();


    public BeverageModel(Beverage x){
        NameProperty.setValue(x.getBaseName());
        ToppingsProperty.setValue(x.getToppings());
        PriceProperty.setValue(String.valueOf(x.getCost()));

    }

    public String getName(){
        return NameProperty.get();
    }
    public String getToppings(){
        return ToppingsProperty.get();
    }
    public String getPrice(){
        return PriceProperty.get();
    }
}

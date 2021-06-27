package Model;

import javafx.beans.property.SimpleStringProperty;

public class Expresso implements Beverage{

    float cost;
    SimpleStringProperty description;
    SimpleStringProperty baseName = new SimpleStringProperty("Expresso");
    public Expresso(){
    cost =1900;
    description=new SimpleStringProperty("Expresso");
}
    @Override
    public String getDescription() {
        return description.get();
    }

    @Override
    public float getCost() {
        return cost;
    }

    @Override
    public String getBaseName() {
        return baseName.get();
    }
    @Override
    public String getToppings() {
        return "No tiene";
    }
}

package Model;

import javafx.beans.property.SimpleStringProperty;

public class Decaf implements Beverage{

    float cost;
    SimpleStringProperty description;
    SimpleStringProperty baseName = new SimpleStringProperty("Decaf");
    public Decaf(){

        cost =2500;
        description=new SimpleStringProperty("Descaf");


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
        return this.getToppings();
    }
}

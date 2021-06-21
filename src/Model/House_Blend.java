package Model;

import javafx.beans.property.SimpleStringProperty;

public class House_Blend implements Beverage{

    float cost;
    SimpleStringProperty description;
    SimpleStringProperty baseName = new SimpleStringProperty("House Blend");
    public House_Blend() {
        cost = 4000;
        description = new SimpleStringProperty("House_Blend");
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

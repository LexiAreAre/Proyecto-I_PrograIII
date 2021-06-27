package Model;

import javafx.beans.property.SimpleStringProperty;

public class Dark_Roast implements Beverage{

    float cost;
    SimpleStringProperty description;
    public SimpleStringProperty baseName = new SimpleStringProperty("Dark Roast");

    public Dark_Roast(){
        cost =3000;
        description=new SimpleStringProperty("Dark_Roast");
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

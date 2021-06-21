package Model;

import javafx.beans.property.SimpleStringProperty;

public class Beverage_Decorator implements Beverage{

    protected StringBuilder toppings = new StringBuilder("");
    private Beverage basic_decorator;



    public Beverage_Decorator(Beverage b_d){
        basic_decorator=b_d;
    }

    @Override
    public String getDescription() {
       return basic_decorator.getDescription();
    }

    @Override
    public float getCost() {
        return basic_decorator.getCost();
    }

    @Override
    public String getBaseName() {
        return basic_decorator.getBaseName();
    }
    public String getToppings()
    {
        return toppings.toString();
    }
}

package Model;

import javafx.beans.property.SimpleStringProperty;

public class Milk_Foam extends Beverage_Decorator{

    private SimpleStringProperty description;
    private final float cost;

    public Milk_Foam(Beverage b_d) {
        super(b_d);
        description=new SimpleStringProperty("Milk Foam");
        cost =500;
        if (this.toppings.isEmpty()){
            this.toppings.append("Milk Foam");
        }
        else{
            this.toppings.append("'\nMilk Foam");
        }
    }

    @Override
    public String getDescription(){
        return super.getDescription()+ '\n' + "     " +description.get();
    }

    @Override
    public float getCost() {
        return super.getCost() + cost;
    }
}

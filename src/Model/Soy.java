package Model;

import javafx.beans.property.SimpleStringProperty;

public class Soy extends Beverage_Decorator{

    private SimpleStringProperty description;
    private final float cost;

    public Soy(Beverage b_d) {
        super(b_d);
        description=new SimpleStringProperty("Soy");
        cost =300;
        if (this.toppings.isEmpty()){
            this.toppings.append("Soy");
        }
        else{
            this.toppings.append("'\nSoy");
        }
    }

    @Override
    public String getDescription(){
        return super.getDescription()+ '\n' + "     " +description.get();
    }

    @Override
    public float getCost() {
        return super.getCost()+ cost;
    }
}

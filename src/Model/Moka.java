package Model;

import javafx.beans.property.SimpleStringProperty;

public class Moka extends Beverage_Decorator{

    private SimpleStringProperty description;
    private final float cost;

    public Moka(Beverage b_d) {
        super(b_d);
        description=new SimpleStringProperty("Moka");
        cost =300;
        if (this.toppings.isEmpty()){
            this.toppings.append("Moka");
        }
        else{
            this.toppings.append("'\nMoka");
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

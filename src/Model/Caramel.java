package Model;

import javafx.beans.property.SimpleStringProperty;

public class Caramel extends Beverage_Decorator{

    private SimpleStringProperty description;
    private final float cost;

   public Caramel(Beverage b_d) {
       super(b_d);
       description=new SimpleStringProperty("Caramel");
       cost =300;
       if (this.toppings.isEmpty()){
           this.toppings.append("Caramel");
       }
       else{
           this.toppings.append("'\nCaramel");
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

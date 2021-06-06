package Model;

public class Caramel extends Beverage_Decorator{
    private String description;
    float costo;
   public Caramel(Beverage b_d) {
       super(b_d);
       description="Caramel";
       costo=300;
    }

    @Override
    public String getDescription(){
        return super.getDescription()+ '+' + description;
    }

    @Override
    public float getCost() {
        return super.getCost()+costo;
    }

}

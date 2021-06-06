package Model;

public class Soy extends Beverage_Decorator{
    private String description;
    private float costo;
    Soy(Beverage b_d) {
        super(b_d);
        description="Caramel";
        costo=300;

    }

    @Override
    public String getDescription(){
        return super.getDescription()+ '+' +description;
    }

    @Override
    public float getCost() {
        return super.getCost()+costo;
    }
}

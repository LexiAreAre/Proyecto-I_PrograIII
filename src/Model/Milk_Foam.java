package Model;

public class Milk_Foam extends Beverage_Decorator{
    private String description;
    private float costo;

    public Milk_Foam(Beverage b_d) {
        super(b_d);
        description="Caramel";
        costo=500;

    }

    @Override
    public String getDescription(){
        return super.getDescription()+description;
    }

    @Override
    public float getCost() {
        return super.getCost() + costo;
    }
}

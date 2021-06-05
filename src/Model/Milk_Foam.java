package Model;

public class Milk_Foam extends Beverage_Decorator{
    private String description;

    public Milk_Foam(Beverage b_d) {
        super(b_d);
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public float getCost() {
        return super.getCost() + 300;
    }
}

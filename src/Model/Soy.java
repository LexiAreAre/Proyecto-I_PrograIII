package Model;

public class Soy extends Beverage_Decorator{
    private String description;

    Soy(Beverage b_d) {
        super(b_d);
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public float getCost() {
        return 0;
    }
}

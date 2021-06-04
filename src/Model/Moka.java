package Model;

public class Moka extends Beverage_Decorator{
    private String description;

    Moka(Beverage b_d) {
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

package Model;

public class Caramel extends Beverage_Decorator{
    private String description;

    Caramel(Beverage b_d) {
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

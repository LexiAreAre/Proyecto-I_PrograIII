package Model;

public class Beverage_Decorator implements Beverage{
    private Beverage basic_decorator;
    Beverage_Decorator(Beverage b_d){

    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public float getCost() {
        return 0;
    }
}

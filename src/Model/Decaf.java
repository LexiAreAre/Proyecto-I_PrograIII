package Model;

public class Decaf implements Beverage{

    float costo;
    String description;

    public Decaf(){

        costo=2500;
        description="Descaf";


    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getCost() {
        return costo;
    }
}

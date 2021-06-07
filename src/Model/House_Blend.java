package Model;

public class House_Blend implements Beverage{

    float costo;
    String description;

    public House_Blend() {
        costo = 4000;
        description = "House_Blend";
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

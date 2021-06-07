package Model;

public class Dark_Roast implements Beverage{

    float costo;
    String description;

    public Dark_Roast(){
        costo=3000;
        description="Dark_Roast";
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

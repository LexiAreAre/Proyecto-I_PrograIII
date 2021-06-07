package Model;
public class Moka extends Beverage_Decorator{

    private String description;
    private float costo;

    public Moka(Beverage b_d) {
        super(b_d);
        description="Moka";
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

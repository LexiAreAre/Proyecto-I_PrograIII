package Model;

public class Expresso implements Beverage{
    //Atributos----------------------------------------------------------------------------------------
    float costo;
    String description;
    // __________________________________________________________________________________________________
//Métodos-----------------------------------------------------------------------------------------------
    public Expresso(){
    costo=1900;
    description="Expresso";



}
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getCost() {
        return costo;
    }

//------------------------------------------------------------------------------------------------------

}

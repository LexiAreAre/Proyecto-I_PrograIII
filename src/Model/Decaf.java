package Model;

public class Decaf implements Beverage{

    //Atributos----------------------------------------------------------------------------------------
    float costo;
    String description;
    // __________________________________________________________________________________________________
//Métodos-----------------------------------------------------------------------------------------------


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

//------------------------------------------------------------------------------------------------------

}

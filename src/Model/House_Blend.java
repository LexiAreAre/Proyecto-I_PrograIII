package Model;

public class House_Blend implements Beverage{
    //Atributos----------------------------------------------------------------------------------------
    float costo;
    String description;
    // __________________________________________________________________________________________________
//Métodos-----------------------------------------------------------------------------------------------
    House_Blend() {
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

//------------------------------------------------------------------------------------------------------

}

package Model;

public class Invoice {
    private float cost;
    private String description;

    public Invoice(float cost, String description){
        this.cost = cost;
        this.description = description;
    }

    public String getinvoiceDescription(){
        return description;
    }

    public String print(){
        return "Cost: " + cost + "\n" + "Description of Invoice: " + description + "\n";
    }

}

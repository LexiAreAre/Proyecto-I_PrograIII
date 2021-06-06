package Model;

import java.util.ArrayList;

public class SystemBeverage {

    ArrayList<Beverage> beverages = new ArrayList<>();

    public static void addTopings(Beverage beverage)
    {
        // desplegamos la ventana para anadir topings

    }

    public String generateInvoice(ArrayList<Beverage> beverageList){
        StringBuilder bill = new StringBuilder();
        for(Beverage i: beverageList)
        {
            bill.append("-------------------------");
           bill.append( i.getDescription());
           bill.append('\n');
           bill.append(i.getCost() + '\n');
        }
        return bill.toString();
    }

    public String printInvoice(){
        return null;
    }

}

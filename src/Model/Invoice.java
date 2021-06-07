package Model;

import java.util.ArrayList;

public class Invoice {

    ArrayList<Beverage> list;

    public Invoice(ArrayList<Beverage> list){
        this.list = list;
    }

    public String printBill(){
        StringBuilder bill = new StringBuilder();
        bill.append("\n---------------------------\n");
       for(Beverage i: this.list)
       {
           bill.append("Product: ");
           bill.append(i.getDescription());
           bill.append('\n');
           bill.append("Price: ");
           bill.append(i.getCost());
           bill.append('\n');
       }
        bill.append("---------------------------\n");
       float total = 0;
       for(Beverage e: this.list){
           total += e.getCost();
       }
       bill.append("Total: ");
       bill.append(total);
       return bill.toString();
    }
}

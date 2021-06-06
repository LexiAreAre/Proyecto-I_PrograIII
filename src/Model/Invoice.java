package Model;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Beverage> list;

    public Invoice(ArrayList<Beverage> list){
        this.list = list;
    }

    public String printBill(){
        StringBuilder bill = new StringBuilder();
        bill.append("---------------------------");
       for(Beverage i: this.list)
       {
           bill.append(i.getDescription());
           bill.append(i.getCost());
       }
        bill.append("---------------------------");
       return bill.toString();
    }
}

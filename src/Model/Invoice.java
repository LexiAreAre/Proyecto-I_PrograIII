package Model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    public ArrayList<Beverage> list;
    private int id;

    public float sumTotal(){
        float sum = 0;
        for (Beverage i:list) {
            sum += i.getCost();
        }
        return sum;
    }

    public int getId(){
        return id;
    }

    public static List<InvoiceModel> pastInvoices;

    public Invoice(ArrayList<Beverage> list){
        this.list = list;
    }

    public String printBill(){
        StringBuilder bill = new StringBuilder();
        bill.append("\n---------------------------\n");
       for(Beverage i: this.list)
       {
           bill.append("Product: \n");
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

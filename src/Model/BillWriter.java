package Model;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BillWriter implements JavaWriter{
    private Invoice invoice;
    @Override
    public void write() {
        try {
            FileWriter writer = new FileWriter("src/Registry/Bills.txt", true);
            writer.write(invoice.printBill());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setInvoice(ArrayList<Beverage> bills){
        this.invoice = new Invoice(bills);
    }
}

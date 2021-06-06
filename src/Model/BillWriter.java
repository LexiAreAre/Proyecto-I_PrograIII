package Model;

import java.io.FileWriter;
import java.io.IOException;

public class BillWriter implements JavaWriter{
    private Invoice invoice;
    @Override
    public void write() {
        try {
            FileWriter writer = new FileWriter("Bills.txt", true);
            writer.write(invoice.printBill());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

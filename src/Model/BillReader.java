package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BillReader implements JavaReader{

    StringBuilder bills = new StringBuilder();

    @Override
    public void read() throws IOException {

        try {
            File file = new File("src/Registry/Bills.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String productName;
            String desc;
            while ((productName = br.readLine()) != null && (desc = br.readLine()) != null) {
                Invoice.pastInvoices.add(new InvoiceModel(productName, desc));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getBillsLog(){
        return bills.toString();
    }
}

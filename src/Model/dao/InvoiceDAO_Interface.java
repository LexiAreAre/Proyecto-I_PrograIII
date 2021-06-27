package Model.dao;
import Model.Beverage;
import Model.Invoice;
import Model.Beverage_Decorator;
import Model.SystemBeverage;

import java.sql.ResultSet;

public interface InvoiceDAO_Interface {
    public boolean create(Invoice invoice);
    public ResultSet read();
    public void update(Invoice i);
    public void delete(int id);
}

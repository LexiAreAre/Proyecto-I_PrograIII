package Model.dao;
import Model.Invoice;

import java.sql.ResultSet;

public interface InvoiceDAO_Interface {
    public boolean create(Invoice i);
    public ResultSet read();
    public boolean update(Invoice i);
    public boolean delete(Invoice i);
}

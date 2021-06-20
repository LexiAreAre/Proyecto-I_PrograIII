package Model.dao;
import Model.Invoice;
public interface InvoiceDAO_Interface {
    public boolean create(Invoice i);
    public boolean read(Invoice i);
    public boolean update(Invoice i);
    public boolean delete(Invoice i);
}

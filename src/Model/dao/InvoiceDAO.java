package Model.dao;

import Model.Invoice;

import java.sql.ResultSet;
import java.sql.Statement;

public class InvoiceDAO implements InvoiceDAO_Interface{
    private DB db = new DB();

    @Override
    public boolean create(Invoice i) {
        return false;
    }

    @Override
    public ResultSet read() {
        try{
            Statement statement = db.getConnection().createStatement();
            String query = "SELECT * FROM invoices";
            return statement.executeQuery(query);
        }catch(Exception exception){
            return null;
        }
    }

    @Override
    public boolean update(Invoice i) {
        return false;
    }

    @Override
    public boolean delete(Invoice i) {
        return false;
    }
}

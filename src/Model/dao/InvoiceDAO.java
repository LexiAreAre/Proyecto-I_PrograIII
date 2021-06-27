package Model.dao;
import Model.Beverage;
import Model.Invoice;
import java.sql.*;

public class InvoiceDAO extends DB implements InvoiceDAO_Interface{
    private DB db = new DB();

    @Override
    public boolean create(Invoice invoice) {
        boolean result = false;
        try{
            //Connection conection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            //db.getConnection();

            Connection conn = DB.conect();
            String query = "insert into mydb.invoice(id, beverage, topping, price)values(?,?,?,?)";
            //PreparedStatement ps = conection.prepareStatement("INSERT INTO invoices values(?,?,?,?)");


            PreparedStatement ps = conn.prepareStatement(query);
            for (Beverage i: invoice.list) {

                ps.setString(1,"0");
                ps.setString(2,i.getBaseName());
                ps.setString(3,i.getToppings());
                ps.setFloat(4,invoice.sumTotal());
            }
            result=ps.execute();
        }catch(Exception ex){
            System.err.println("Got an exception i! ");
            System.err.println(ex.getMessage());
        }
        return result;
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
    public void update(Invoice invoice) {
        try{
            Connection conn = DB.conect();
            String query = "UPDATE mydb.invoices SET beverage=?,topping=?,price=?, WHERE id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            //preparedStatement.setString(1,invoice.getBeverageName());
            //preparedStatement.setString(2,invoice.getBeverage_Decorator());
            preparedStatement.setFloat(3,invoice.sumTotal());
            preparedStatement.setInt(4,invoice.getId());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            System.err.println("Got an Exception! ");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        try{
            Connection conn = DB.conect();
            String query = "delete from mydb.invoices where id=?;";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            conn.close();
        }catch(Exception ex){
            System.err.println("Got an Exception!");
            System.err.println(ex.getMessage());
        }
    }
}

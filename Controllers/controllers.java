package Controllers;

import Repositories.Statements;
import Users.Customers;
import Users.Manager;
import Users.Products;
import Users.Shippers;

import java.sql.SQLException;
import java.util.List;

public class controllers {
    private final Statements st;
    public controllers(Statements st) {
        this.st = st;
    }
    public String getAllManagers() throws SQLException, ClassNotFoundException {
        List<Manager> managers = st.getAllManagers();
        return managers.toString();
    }
    public String getAllProducts() throws SQLException, ClassNotFoundException {
        List<Products> products = st.getAllProducts();
        return products.toString();
    }
    public String getAllShippers() throws SQLException, ClassNotFoundException {
        List<Shippers> shippers = st.getAllShippers();
        return shippers.toString();
    }
    public String createCustomer(int id, String fname, String lname, String telephone, String address){
        Customers customers = new Customers(id, fname, lname, telephone, address);
        return null;
    }
}

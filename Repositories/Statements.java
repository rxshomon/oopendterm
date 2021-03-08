package Repositories;

import Database.ConnectionToDB;
import Users.Products;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import Users.Manager;
import Users.Shippers;
import Users.Customers;

public class Statements {
    private final ConnectionToDB db;

    public Statements(ConnectionToDB db) {
        this.db = db;
    }
    public List<Products> getAllProducts() throws SQLException, ClassNotFoundException {
     Connection connection = null;
     try{
         connection = db.checkConnection();
         String sql = "SELECT * FROM Store";
         Statement statement = connection.createStatement();
         ResultSet resultset = statement.executeQuery(sql);
         List<Products> products = new LinkedList<>();
         while (resultset.next()){
             Products product = new Products();
             product.setId(resultset.getInt("product_id"));
             product.setName(resultset.getString("name"));
             product.setPrice(resultset.getInt("price"));
             product.setSize(resultset.getString("size"));
             product.setMaterial(resultset.getString("material"));
             product.setCategory(resultset.getString("category"));
             products.add(product);
         }
         return products;
     } catch (SQLException | ClassNotFoundException throwables) {
         throwables.printStackTrace();
     } finally {
         try {
             assert connection != null;
             connection.close();
         }
         catch (SQLException throwables) {
             throwables.printStackTrace();
         }
     }
        return null;
    }
    public List<Manager> getAllManagers() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        try{
            connection = db.checkConnection();
            String sql = "SELECT * FROM Manager";
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            List<Manager> managers = new LinkedList<>();
            while (resultset.next()){
                Manager manager = new Manager();
                manager.setId(resultset.getInt("manager_id"));
                manager.setFname(resultset.getString("manager_fname"));
                manager.setLname(resultset.getString("manager_lname"));
                managers.add(manager);
            }
            return managers;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    public List<Shippers> getAllShippers() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        try{
            connection = db.checkConnection();
            String sql = "SELECT * FROM Shippers";
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            List<Shippers> shippers = new LinkedList<>();
            while (resultset.next()){
                Shippers shipper = new Shippers();
                shipper.setId(resultset.getInt("shippers_id"));
                shipper.setName(resultset.getString("shippers_name"));
                shipper.setTelephone(resultset.getString("shippers_telephone"));
                shippers.add(shipper);
            }
            return shippers;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    public boolean createCustomer(Customers customer) {
        Connection connection = null;
        try {
            connection = db.checkConnection();
            String sql = "INSERT INTO Customers(customer_id,customer_fname,customer_lname, customer_telephone, customer_address)" +
                    " VALUES (?,?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, customer.getId());
            st.setString(2, customer.getFname());
            st.setString(3, customer.getLname());
            st.setString(3, customer.getTelephone());
            st.setString(3, customer.getAddress());
            st.execute();
            return true;
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}



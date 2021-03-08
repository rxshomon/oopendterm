import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private final Controllers.controllers controllers;
    public App(Controllers.controllers controllers) {
        this.controllers = controllers;
    }
    Scanner sc = new Scanner(System.in);
    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My hueta");
            System.out.println("Select option:");
            System.out.println("1. Get all products");
            System.out.println("2. Get all managers");
            System.out.println("3. Get all Shippers");
            System.out.println("4. Create User");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-4): ");
                int option = sc.nextInt();
                if (option == 1) {
                    getAllProducts();
                } else if (option == 2) {
                    getAllManagers();
                } else if (option == 3) {
                    getAllShippers();
                } else if (option == 4) {
                    createCustomer();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                sc.nextLine(); // to ignore incorrect input
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void getAllProducts() throws SQLException, ClassNotFoundException {
        String response = controllers.getAllProducts();
        System.out.println(response);
    }
    public void getAllManagers() throws SQLException, ClassNotFoundException {
        String response = controllers.getAllManagers();
        System.out.println(response);
    }
    public void getAllShippers() throws SQLException, ClassNotFoundException {
        String response = controllers.getAllShippers();
        System.out.println(response);
    }
    public void createCustomer() {
        System.out.println("Please choose id: ");
        int id = sc.nextInt();
        System.out.println("Please enter Name: ");
        String fname= sc.next();
        System.out.println("Please enter surname: ");
        String lname = sc.next();
        System.out.println("Please enter telephone number: ");
        String telephone = sc.next();
        System.out.println("Please enter address");
        String address = sc.next();
        String response = controllers.createCustomer(id, fname, lname, telephone, address);
        System.out.println(response);
    }
}

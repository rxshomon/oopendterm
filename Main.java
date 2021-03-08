import Controllers.controllers;
import Database.ConnectionToDB;
import Repositories.Statements;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionToDB db = new ConnectionToDB();
        Statements st = new Statements(db);
        controllers controllers = new controllers(st);
        App app = new App(controllers);
        app.start();
    }
}

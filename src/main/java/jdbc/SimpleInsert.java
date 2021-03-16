package jdbc;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleInsert {

    public static void main(String[] args) {
        MariaDbDataSource ds;
        String url = "jdbc:mariadb://localhost:3306/employees?useUnicode=true";
        try {
            ds = new MariaDbDataSource();
            ds.setUrl(url);
            ds.setUser("employees");
            ds.setPassword("employees");

            new SimpleInsert().insertNameIntoEmployees(ds);
            new SimpleInsert().insertNameIntoEmployeesParam(ds, "Clint Eastwood");
        } catch (SQLException se) {
            throw new IllegalStateException("Unable to connect to database!", se);
        }
    }

    private void insertNameIntoEmployeesParam(MariaDbDataSource ds, String name) {
        try (Connection dbc = ds.getConnection();
             PreparedStatement sql = dbc.prepareStatement("INSERT INTO employees (emp_name) VALUES (?)")
        ) {
            sql.setString(1, name);
            sql.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to write data!", se);
        }
    }

    private void insertNameIntoEmployees(MariaDbDataSource ds) {
        try (Connection dbc = ds.getConnection();
             Statement sql = dbc.createStatement()
        ) {
             sql.executeUpdate("INSERT INTO employees (emp_name) VALUES ('John Rambo')");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to write data!", se);
        }
    }


}

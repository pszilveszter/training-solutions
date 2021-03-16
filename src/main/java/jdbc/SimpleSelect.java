package jdbc;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleSelect {

    public static void main(String[] args) {
        MariaDbDataSource ds;
        String url = "jdbc:mariadb://localhost:3306/employees?useUnicode=true";
        try {
            ds = new MariaDbDataSource();
            ds.setUrl(url);
            ds.setUser("employees");
            ds.setPassword("employees");

            new SimpleSelect().listEmployees(ds);
            new SimpleSelect().listEmployeesParam(ds, 2);
        } catch (SQLException se) {
            throw new IllegalStateException("Unable to connect to database!", se);
        }
    }

    private void listEmployeesParam(MariaDbDataSource ds, int idNum) {
        try (Connection dbc = ds.getConnection();
             PreparedStatement sql = dbc.prepareStatement("SELECT emp_name FROM employees WHERE id = ?")
        ) {
            sql.setInt(1, idNum);
            ResultSet rs = sql.executeQuery();
            if (rs.next()) {
                String name = rs.getString("emp_name");
                System.out.println(name);
                return;
            }
            throw new IllegalArgumentException("No data found");
        } catch (SQLException se) {
            throw new IllegalStateException("Unable to read data!", se);

        }
    }

    private void listEmployees(MariaDbDataSource ds) {
        List<String> names = new ArrayList<>();
        try (Connection dbc = ds.getConnection();
             Statement sql = dbc.createStatement();
             ResultSet rs = sql.executeQuery("SELECT emp_name FROM employees ORDER BY id")
        ) {
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            System.out.println(names);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to read data!", se);
        }
    }
}

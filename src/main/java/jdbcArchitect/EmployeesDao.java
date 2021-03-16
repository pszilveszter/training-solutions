package jdbcArchitect;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {


    private MariaDbDataSource mds;

    public EmployeesDao(MariaDbDataSource mds) {
        this.mds = mds;
    }

    public void createEmployee(String name) {
        try (Connection dbc = mds.getConnection();
             PreparedStatement sql = dbc.prepareStatement("INSERT INTO employees (emp_name) VALUES (?)")
        ) {
            sql.setString(1, name);
            sql.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to write data!", se);
        }
    }

    public List<String> listEmployeeNames() {
        List<String> names = new ArrayList<>();
        try (Connection dbc = mds.getConnection();
             Statement sql = dbc.createStatement();
             ResultSet rs = sql.executeQuery("SELECT emp_name FROM employees ORDER BY id")
        ) {
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to read data!", se);
        }
    }


    public String getEmployeeName(int idNum) {
        try (Connection dbc = mds.getConnection();
             PreparedStatement sql = dbc.prepareStatement("SELECT emp_name FROM employees WHERE id = ?")
        ) {
            sql.setInt(1, idNum);
            ResultSet rs = sql.executeQuery();
            if (rs.next()) {
                return rs.getString("emp_name");
            }
            throw new IllegalArgumentException("No data found");
        } catch (SQLException se) {
            throw new IllegalStateException("Unable to read data!", se);

        }
    }
}

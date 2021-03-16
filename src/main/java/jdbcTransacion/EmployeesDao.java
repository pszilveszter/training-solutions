package jdbcTransacion;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {


    private MariaDbDataSource mds;

    public EmployeesDao(MariaDbDataSource mds) {
        this.mds = mds;
    }


    public void createEmployees(List<String> employeNames) {
        try (Connection dbc = mds.getConnection())
        {
            dbc.setAutoCommit(false);
            try (PreparedStatement ps = dbc.prepareStatement("INSERT INTO employees (emp_name) VALUES (?)")) {
                for (String name: employeNames) {
                    if (name.startsWith("X")) {
                        throw new IllegalArgumentException("Invalid name");
                    }
                    ps.setString(1, name);
                    ps.executeUpdate();
                }
                dbc.commit();
            }
            catch (IllegalArgumentException iae) {
                dbc.rollback();
            }
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to write data!", se);
        }
    }


    public long createEmployee(String name) {
        try (Connection dbc = mds.getConnection();
             PreparedStatement sql = dbc.prepareStatement("INSERT INTO employees (emp_name) VALUES (?)", Statement.RETURN_GENERATED_KEYS)
        ) {
            sql.setString(1, name);
            sql.executeUpdate();

            return getIdByStatement(sql);
        }
        catch (SQLException se) {
            throw new IllegalStateException("Unable to write data!", se);
        }
    }

    private long getIdByStatement(PreparedStatement sql) {
        try (ResultSet rs = sql.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new SQLException("Could not generate key");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Key is not generated", se);
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


    public String getEmployeeName(long idNum) {
        try (Connection dbc = mds.getConnection();
             PreparedStatement sql = dbc.prepareStatement("SELECT emp_name FROM employees WHERE id = ?")
        ) {
            sql.setLong(1, idNum);
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

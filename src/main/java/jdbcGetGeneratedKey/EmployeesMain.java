package jdbcGetGeneratedKey;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

public class EmployeesMain {

    public static void main(String[] args) {

        MariaDbDataSource ds;
        String url = "jdbc:mariadb://localhost:3306/employees?useUnicode=true";
        try {
            ds = new MariaDbDataSource();
            ds.setUrl(url);
            ds.setUser("employees");
            ds.setPassword("employees");

            EmployeesDao ed = new EmployeesDao(ds);
            Long id = ed.createEmployee("John Rambo");
            System.out.println(ed.listEmployeeNames());
            System.out.println(ed.getEmployeeName(4));
        } catch (
                SQLException se) {
            throw new IllegalStateException("Unable to connect to database!", se);
        }
    }
}

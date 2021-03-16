package jdbcGetGeneratedKey;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    EmployeesDao ed;

    @BeforeEach
    void init() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");

            Flyway fw = Flyway.configure().locations("/db/migration/employees").dataSource(dataSource).load();

            fw.clean();
            fw.migrate();

            ed = new EmployeesDao(dataSource);
        } catch (SQLException se) {
            throw new IllegalStateException("Unable to connect database", se);
        }
    }

    @Test
    void testInsert() {
        ed.createEmployee("John Rambo");
        ed.createEmployee("Clint Eastwood");
        assertEquals(Arrays.asList("John Rambo", "Clint Eastwood"), ed.listEmployeeNames());
    }

    @Test
    void testInsertOne() {
        String name = "John Rambo";
        ed.createEmployee(name);
        assertEquals(name, ed.getEmployeeName(1));
    }

    @Test
    void testById() {
        String name = "John Carpenter";
        long id = ed.createEmployee(name);
        String result = ed.getEmployeeName(id);
        assertEquals(name, result);
    }


}
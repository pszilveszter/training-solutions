package jdbcTransacion;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

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
    void testCreateEmployeesCommit() {
        ed.createEmployees(List.of("John Rambo", "Elvis Presley", "Bill Clinton"));
        List<String> names = ed.listEmployeeNames();
        assertEquals(3, names.size());
        assertEquals("Bill Clinton", names.get(2));
    }

    @Test
    void testCreateEmployeesRollback() {
        ed.createEmployees(List.of("John Rambo", "Elvis Presley", "Xantus Barbara"));
        List<String> names = ed.listEmployeeNames();
        assertTrue(names.isEmpty());
    }
}
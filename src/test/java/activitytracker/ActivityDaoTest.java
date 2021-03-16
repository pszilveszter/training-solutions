package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao ad;

    @BeforeEach
    void init() {
        MariaDbDataSource ds;
        String url = "jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true";
        try {
            ds = new MariaDbDataSource();
            ds.setUrl(url);
            ds.setUser("activitytracker");
            ds.setPassword("activitytracker");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Could not connect database", se);
        }

        Flyway fw = Flyway.configure().locations("/db/migration/activityTracker").dataSource(ds).load();
        fw.clean();
        fw.migrate();

        ad = new ActivityDao(ds);
    }

    @Test
    void testSelectAll() {
        assertEquals(3, ad.readAll().size());
    }

    @Test
    void testSelectById() {
        assertEquals(ActivityType.BIKING, ad.findActivityById(1).getType());
        assertEquals(LocalDateTime.of(2000, 12, 3, 10, 23), ad.findActivityById(1).getStartTime());
        assertEquals("Biking around Balaton", ad.findActivityById(1).getDesc());
        assertEquals(1L, ad.findActivityById(1).getId());
    }

    @Test
    void testInsertActivity() {
        Activity a = new Activity(LocalDateTime.of(2020,3,17, 11, 0), "Biking around the world", ActivityType.BIKING);

        Activity result = ad.saveActivity((a));
        assertEquals(4, ad.readAll().size());
        assertEquals(4, ad.findActivityById(result.getId()).getId());
    }

}
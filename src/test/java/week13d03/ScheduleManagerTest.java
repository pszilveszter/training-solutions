package week13d03;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleManagerTest {

    InputStream stream = this.getClass().getResourceAsStream("beosztas.txt");

    @Test
    void testReadHoursOfTeacher() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        ScheduleManager sm = new ScheduleManager(reader);
        int hours = sm.readHoursOfTeacher("Szarvas Szamanta");
        assertEquals(18, hours);
    }

}
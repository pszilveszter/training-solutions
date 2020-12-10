package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    void newPendingCourse() {
        Lab pending = new Lab("JAVA OO");
        assertEquals("JAVA OO is not yet completed", pending.toString());
    }

    @Test
    void newCompletedCourse() {
        Lab done = new Lab("JAVA Alapok", LocalDate.of(2020,12,1));
        assertEquals("JAVA Alapok is completed on 2020-12-1", done.toString());
    }

    @Test
    void newCompletedNOW() {
        Lab pending = new Lab("week7d04");
        pending.complete();
        assertEquals("week7d04 is completed on 2020-12-10", pending.toString());
    }

    @Test
    void newCompletedAt() {
        Lab pending = new Lab("week7d03");
        pending.complete(LocalDate.of(2020,12,9));
        assertEquals("week7d03 is completed on 2020-12-9", pending.toString());
    }

}
package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    void newToString() {
        Lab pending = new Lab("JAVA");
        assertEquals("JAVA is not yet completed", pending.toString());
    }


    @Test
    void newPendingCourse() {
        Lab pending = new Lab("JAVA OO");
        assertFalse(pending.isCompleted());
        assertEquals("JAVA OO", pending.getTitle());
    }

    @Test
    void newCompletedCourse() {
        Lab done = new Lab("JAVA Alapok", LocalDate.of(2020,12,1));
        assertTrue(done.isCompleted());
        assertEquals("JAVA Alapok", done.getTitle());
        assertEquals(LocalDate.of(2020,12,1), done.getCompletedAt());
    }

    @Test
    void newCompletedNOW() {
        Lab pending = new Lab("week7d04");
        pending.complete();
        assertTrue(pending.isCompleted());
        assertEquals("week7d04", pending.getTitle());
        assertEquals(LocalDate.now(), pending.getCompletedAt());
    }

    @Test
    void newCompletedAt() {
        Lab pending = new Lab("week7d03");
        pending.complete(LocalDate.of(2020,12,9));
        assertTrue(pending.isCompleted());
        assertEquals("week7d03", pending.getTitle());
        assertEquals(LocalDate.of(2020,12,9), pending.getCompletedAt());
    }

}
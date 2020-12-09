package week07d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testAddDate() {
        Date d = Date.addDate(2020,12,9);
        assertEquals(2020, d.getYear());
        assertEquals(12, d.getMonth());
        assertEquals(9, d.getDay());
    }

    @Test
    void testWithYear() {
        Date dWithX = Date.addDate(1977,12,30);
        Date nDate = dWithX.withYear(2020);
        assertEquals(2020, nDate.getYear());
        assertEquals(12, nDate.getMonth());
        assertEquals(30, nDate.getDay());
    }

    @Test
    void testWithMonth() {
        Date dWithX = Date.addDate(1977,12,30);
        Date nDate = dWithX.withMonth(1);
        assertEquals(1977, nDate.getYear());
        assertEquals(1, nDate.getMonth());
        assertEquals(30, nDate.getDay());
    }

    @Test
    void testWithDay() {
        Date dWithX = Date.addDate(1977,12,30);
        Date nDate = dWithX.withDay(1);
        assertEquals(1977, nDate.getYear());
        assertEquals(12, nDate.getMonth());
        assertEquals(1, nDate.getDay());
    }

}
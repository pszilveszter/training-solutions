package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void daysInMonth() {
        assertEquals(29,DayInMonth.daysInMonth(2000,"Február"));
        assertEquals(29,DayInMonth.daysInMonth(2004,"Február"));
        assertEquals(28,DayInMonth.daysInMonth(2100,"február"));
        assertEquals(28,DayInMonth.daysInMonth(1977,"FEBRUÁR"));
        assertEquals(30,DayInMonth.daysInMonth(2020,"április"));
        assertEquals(31,DayInMonth.daysInMonth(2020,"január"));
    }
}
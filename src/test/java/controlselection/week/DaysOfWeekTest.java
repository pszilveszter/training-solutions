package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysOfWeekTest {

    @Test
    public void testDaysOfWeekClass() {
         assertEquals("Hét eleje van", DayOfWeeks.evaulateDay("HÉTFŐ"));
         assertEquals("Hét közepe van", DayOfWeeks.evaulateDay("cSüTörTöK"));
         assertEquals("Majdnem hétvége van", DayOfWeeks.evaulateDay("Péntek"));
         assertEquals("Hétvége van", DayOfWeeks.evaulateDay("vasárnap"));


    }

}

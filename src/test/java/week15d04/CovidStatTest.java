package week15d04;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CovidStatTest {


    CovidStat cs = new CovidStat(this.getClass().getResourceAsStream("data.csv"));


    @Test
    void testReadFile() {

        Map<Continent, Map<Country, List<Case>>> result = cs.getReport();
        assertEquals(6, result.size());
        assertEquals(55, cs.getReport().get(new Continent("Africa")).size());
        assertEquals(-9, cs.getReport().get(new Continent("Other")).get(new Country("Cases_on_an_international_conveyance_Japan", "JPG11668")).get(0).getCases());

    }


    @Test
    void testTop3WeekByCountry() {
        List<String> result = cs.top3WeekByCountry("Hungary");
        assertEquals(3, result.size());
        assertEquals("33156 cases on week 2021/49", result.get(2));
    }

}
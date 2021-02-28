package week13d02;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightManagerTest {

    BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/cities.txt")));
    FlightManager fm = new FlightManager();

    @Test
    void testReadFromFile() {
        fm.readFromFile(reader);
        List<Flight> flights = fm.getFlights();
        assertEquals(100, flights.size());
        assertEquals(LocalTime.of(11,5), flights.get(flights.size() - 1).getTime());
    }


    @Test
    void testDirectionStatistics() {
        fm.readFromFile(reader);
        FlightDirection direction = fm.directionStatistic();
        assertEquals(FlightDirection.DEPARTURE, direction);
    }


    @Test
    void testGetByNumber() {
        fm.readFromFile(reader);
        Flight f = fm.getByNumber("FK1870");

        assertEquals("FK1870", f.getNumber());
        assertEquals(FlightDirection.DEPARTURE, f.getDirection());
        assertEquals("Moscow", f.getCity());
        assertEquals(LocalTime.of(6,48), f.getTime());
    }


    @Test
    void testGetByNumberInavlid() {
        fm.readFromFile(reader);

        Flight f = fm.getByNumber("FK187");
        assertNull(f);
    }

    @Test
    void getFlightsOfCity() {
        fm.readFromFile(reader);

        List<Flight> flights = fm.getFlightsOfCity("Wien", "Departure");

        assertEquals(5, flights.size());
        assertEquals("SX9456", flights.get(4).getNumber());
    }


    @Test
    void getFlightsOfCityInavlid() {
        fm.readFromFile(reader);

        Exception ex = assertThrows(IllegalArgumentException.class, ()-> fm.getFlightsOfCity("Wienna", "Departure"));

        assertEquals("No corresponding flight is found Wienna, Departure", ex.getMessage());
    }


    @Test
    void getFlightsOfCityInavlidDirection() {
        fm.readFromFile(reader);

        Exception ex = assertThrows(IllegalArgumentException.class, ()-> fm.getFlightsOfCity("Wien", "Departre"));

        assertEquals("Unable to match direction", ex.getMessage());
    }

    @Test
    void earliestFlight() {
        fm.readFromFile(reader);
        Flight first = fm.earliestFlight();

        assertEquals(LocalTime.of(6,16), first.getTime());
        assertEquals("FG3210", first.getNumber());
    }
}
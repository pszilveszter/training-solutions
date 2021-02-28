package week13d02;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    Flight f = new Flight("FC5354", FlightDirection.ARRIVAL, "Dublin", LocalTime.of(18,16));

    @Test
    void getNumber() {
        assertEquals("FC5354", f.getNumber());
    }

    @Test
    void getDirection() {
        assertEquals(FlightDirection.ARRIVAL, f.getDirection());
    }

    @Test
    void getCity() {
        assertEquals("Dublin", f.getCity());
    }

    @Test
    void getTime() {
        assertEquals(LocalTime.of(18,16), f.getTime());
    }
}
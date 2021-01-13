package week11d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {

    @Test
    void testCreate() {
        Ride r = new Ride(1, 8, 10);
        assertEquals(1, r.getDay());
        assertEquals(8, r.getNr());
        assertEquals(1, r.getDistance());
    }

    @Test
    void testFailure() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new Ride(0, 1, 10));
        assertEquals("Input mismatch! 0 is out of range", ex.getMessage());
    }

}
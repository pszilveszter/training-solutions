package week11d02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Ride firstDayFirst = new Ride(1,1,10);
    Ride firstDaySecond = new Ride(1,2,10);
    Ride secondDayFirst = new Ride(2,1,10);
    Ride secondDaySecond = new Ride(2,2,10);
    Courier courier;

    @BeforeEach
    void createCourier() {
        courier = new Courier();
    }

    @Test
    void testAddRide() {
        courier.addRide(firstDayFirst);
        assertEquals(1, courier.getRides().size());
        assertEquals(1, courier.getRides().get(0).getDay());
        assertEquals(1, courier.getRides().get(0).getNr());
        assertEquals(10, courier.getRides().get(0).getDistance());
    }

    @Test
    void testAddDayBeforeLast() {
        courier.addRide(secondDayFirst);
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> courier.addRide(firstDayFirst));
        assertEquals("Input mismatch!", ex.getMessage());
    }

    @Test
    void testNextRunFailureFirstDay() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> courier.addRide(firstDaySecond));
        assertEquals("Input mismatch!", ex.getMessage());
    }

    @Test
    void testNextRunFailure() {
        courier.addRide(firstDayFirst);
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> courier.addRide(firstDayFirst));
        assertEquals("Input mismatch!", ex.getMessage());
    }


    @Test
    void testNextRunFailureNewDay() {
        courier.addRide(firstDayFirst);
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> courier.addRide(secondDaySecond));
        assertEquals("Input mismatch!", ex.getMessage());
    }

    @Test
    void testNonWorkingDay() {
        courier.addRide(secondDayFirst);
        assertEquals(1, courier.getNonWorkDay());
    }

    @Test
    void testMissingNonWorkingDay() {
        courier.addRide(firstDayFirst);
        assertEquals(-1, courier.getNonWorkDay());
    }

}
package week10d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    MaxTravel maxTravel = new MaxTravel();

    @Test
    void testMaxWithBusZero() {
        List<Integer> passengers = List.of(0,0,0,100,100,100,100,200,200,1);
        assertEquals(100,maxTravel.getMaxIndex(passengers));
    }

    @Test
    void testMaxWithoutBusZero() {
        List<Integer> passengers = List.of(5,5,15,50,50,50,25);
        assertEquals(50,maxTravel.getMaxIndex(passengers));
    }

    @Test
    void testNullParameter() {
        List<Integer> passengers = new ArrayList<>();
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> maxTravel.getMaxIndex(passengers));
        assertEquals("Missing or emtpy list of integer values", ex.getMessage());
    }

    @Test
    void testLimitOverflow() {
        List<Integer> passengers = List.of(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
        Exception ex = assertThrows(ArrayIndexOutOfBoundsException.class, ()-> maxTravel.getMaxIndex(passengers));
        assertEquals("Limit exceeded, no more than 30 bus is accepted!", ex.getMessage());
    }

}
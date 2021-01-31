package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalculator() {
        int[] given = new int[]{1, 3, 9, 7, 5};
        assertEquals(16, new Calculator().findMinSum(given));
    }

}
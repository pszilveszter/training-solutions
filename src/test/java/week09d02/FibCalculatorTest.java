package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibCalculatorTest {

    @Test
    void testCalc() {
        FibCalculator fc = new FibCalculator();
        long sumOfEven = fc.sumEvens(10);
        assertEquals(10, sumOfEven);

    }

}
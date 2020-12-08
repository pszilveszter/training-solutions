package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumTest {

    @Test
    void testDigitsum() {
        DigitSum ds = new DigitSum();
        assertEquals(6,ds.sumOfDigits(123));
    }

    @Test
    void testNegativeDigitsum() {
        DigitSum ds = new DigitSum();
        assertEquals(6,ds.sumOfDigits(-123));
    }

}
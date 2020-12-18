package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmTest {

    @Test
    void testMathAlgorithm() {
        assertEquals(2, new MathAlgorithm().greatestCommonDivisor(6,8));
        assertEquals(2, new MathAlgorithm().greatestCommonDivisor(8, 6));
        assertEquals(1, new MathAlgorithm().greatestCommonDivisor(2, 3));
    }

}
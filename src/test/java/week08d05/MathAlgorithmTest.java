package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmTest {

    @Test
    void testMathAlgorithm() {
        assertEquals(3, new MathAlgorithm().greatestCommonDivisor(9,12));
        assertEquals(3, new MathAlgorithm().greatestCommonDivisor(12, 9));
    }

}
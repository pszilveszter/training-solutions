package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testIsPrimeNegativeException(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> MathAlgorithms.isPrime(-1)) ;
        assertEquals("Negative and zero values are unexpected!", ex.getMessage());
    }

    @Test
    void testIsPrimeZeroException(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> MathAlgorithms.isPrime(0)) ;
        assertEquals("Negative and zero values are unexpected!", ex.getMessage());
    }

    @Test
    void testIsPrimeFalse() {
        assertTrue(MathAlgorithms.isPrime(1));
    }

    @Test
    void testIsPrimeTrue() {
        assertFalse(MathAlgorithms.isPrime(2));
    }

    @Test
    void testIsPrimeAll() {
        assertTrue(MathAlgorithms.isPrime(13));
        assertTrue(MathAlgorithms.isPrime(7));
        assertFalse(MathAlgorithms.isPrime(8));
        assertFalse(MathAlgorithms.isPrime(9));
    }
}
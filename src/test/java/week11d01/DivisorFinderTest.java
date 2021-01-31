package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void testDivisorFinder() {
        assertEquals(1, new DivisorFinder().findDivisors(425));
    }

}
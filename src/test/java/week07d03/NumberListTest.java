package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test
    void isIncreasingTest() {
        NumberList nl = new NumberList();
        assertTrue(nl.isIncreasing(Arrays.asList(-1,1,2,2,3,3,4,4,10000)));
        assertFalse(nl.isIncreasing(Arrays.asList(1,0)));
    }

    @Test
    void isIncreasing2Test() {
        NumberList nl = new NumberList();
        assertTrue(nl.isIncreasing2(Arrays.asList(-1,1,2,2,3,3,4,4,10000)));
        assertFalse(nl.isIncreasing2(Arrays.asList(1,0)));
    }


    @Test
    void isIncreasing3Test() {
        NumberList nl = new NumberList();
        assertTrue(nl.isIncreasing3(Arrays.asList(-1,1,2,2,3,3,4,4,10000)));
        assertFalse(nl.isIncreasing3(Arrays.asList(1,0)));
    }

}
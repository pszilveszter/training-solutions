package stringbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCreatorTest {
    @Test
    public void sameStringsInPoolShouldBeTheSameObject() {
        //Given
        StringCreator sc = new StringCreator();

        //Then
        assertTrue(sc.createStringForPool() == sc.createStringForPool());
        assertFalse(sc.createStringForHeap() == sc.createStringForHeap());
        assertTrue(sc.createStringForPool().equals(sc.createStringForHeap()));
    }

    @Test
    public void sameStringsShouldBeTheSameByCanonicalRepresentation() {
        //Given
        StringCreator sc = new StringCreator();

        //Then
        assertTrue(sc.createStringForHeap().intern() == sc.createStringForHeap().intern());
        assertTrue(sc.createStringForHeap().intern() == sc.createStringForPool().intern());
    }
}
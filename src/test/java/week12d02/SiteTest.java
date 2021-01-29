package week12d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiteTest {

    @Test
    void testInvalidSide() {
        int lowNumber = -1;
        int hihNumber = 2;
        Exception exLow = assertThrows(IllegalArgumentException.class, ()-> new Site(lowNumber, 1, Fence.NO_FENCE));
        Exception exHigh = assertThrows(IllegalArgumentException.class, ()-> new Site(hihNumber, 1, Fence.NO_FENCE));
        assertEquals("Invalid side " + lowNumber, exLow.getMessage());
        assertEquals("Invalid side " + hihNumber, exHigh.getMessage());
    }

    @Test
    void testInvalidLenght() {
        int lowNumber = 0;
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new Site(0, lowNumber, Fence.NO_FENCE));
        assertEquals("Invalid lenght " + lowNumber, ex.getMessage());
    }

    @Test
    void testCreate() {
        Site site = new Site(0, 10, Fence.PERFECT);
        assertEquals(0, site.getSide());
        assertEquals(10, site.getLenght());
        assertEquals(Fence.PERFECT, site.getFence());
    }

}
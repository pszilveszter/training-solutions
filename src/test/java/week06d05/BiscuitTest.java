package week06d05;

import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test
    void addNew() {
        Object o = Biscuit.of(BiscuitType.KINDERCOUNTRY, 100);
        assertEquals("KINDERCOUNTRY 100", o.toString());
    }

    @Test
    void testNegativAmount() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> Biscuit.of(BiscuitType.KINDERCOUNTRY, -100));
        assertEquals("Bad data!", ex.getMessage());
    }

    @Test
    void testInvalidBusicuit() {
        assertThrows(IllegalArgumentException.class, ()-> Biscuit.of(BiscuitType.valueOf("VALAMI"),100));
    }
}
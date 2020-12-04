package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {

    @Test
    void addNew() {
        Object o = Biscuit.of(BiscuitType.KINDERCOUNTRY, 100);
        assertEquals("KINDERCOUNTRY 100", o.toString());
    }

}
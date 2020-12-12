package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void testNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new NameChanger(null));
        assertEquals("Invalid name: null", ex.getMessage());
    }

    @Test
    void testEmpty() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new NameChanger(""));
        assertEquals("Invalid name: ", ex.getMessage());
    }

    @Test
    void testNoSpace() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new NameChanger("Szilveszter.Pinter"));
        assertEquals("Invalid name: Szilveszter.Pinter", ex.getMessage());
    }

    @Test
    void testAdd() {
        NameChanger nc = new NameChanger("Szilveszter Pinter");
        assertEquals("Szilveszter Pinter", nc.getFullName());
    }

    @Test
    void testChange() {
        NameChanger nc = new NameChanger("Szilveszter Pinter");
        nc.changeFirstName("Vince");
        assertEquals("Vince Pinter", nc.getFullName());
    }

}
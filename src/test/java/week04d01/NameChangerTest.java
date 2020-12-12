package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void testHandleNullError() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new NameChanger(null));
        assertEquals("Inavlid name null",ex.getMessage());
    }

    @Test
    void testHandleEmptyError() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new NameChanger(""));
        assertEquals("Inavlid name ",ex.getMessage());
    }

    @Test
    void testCreateNew() {
        assertEquals("Ali Baba",new NameChanger("Ali Baba").getFullName());
    }


    @Test
    void testChangeName() {
        NameChanger name = new NameChanger("Ali Baba");
        name.changeFirstName("Merci");
        assertEquals("Merci Baba", name.getFullName());
    }
}
package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void addSucceeded() {
        User u = new User("Arany", "János", "arany.j@gmail.com");
        assertEquals("Arany János", u.getFullName());
    }

    @Test
    void addFailed() {
        assertThrows(IllegalArgumentException.class, ()-> new User("Arany","János","arany.janos@gmailcom"));
    }

}
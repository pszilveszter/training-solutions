package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LettersTest {


    Letters l = new Letters();


    @Test
    void testCountIdenticalLetters() {
        assertEquals(3, l.countIdenticalLetters(" ab9\nF\\á$Đ"));
    }


    @Test
    void testCountIdenticalLettersNull() {
        assertEquals(0, l.countIdenticalLetters(null));
    }


    @Test
    void testCountIdenticalLettersEmpty() {
        assertEquals(0, l.countIdenticalLetters(""));
    }
}
package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void toConsonant() {

        ToConsonant letter = new ToConsonant();

        assertEquals("b", letter.toConsonant('a'));
        assertEquals("b", letter.toConsonant('A'));
        assertEquals("b", letter.toConsonant('b'));
        assertEquals("f", letter.toConsonant('e'));
        assertEquals("j", letter.toConsonant('i'));
        assertEquals("p", letter.toConsonant('o'));
        assertEquals("v", letter.toConsonant('u'));
        assertEquals("z", letter.toConsonant('z'));
    }
}
package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLetterTest {

    @Test
    public void testChangeLetter() {
        ChangeLetter cl = new ChangeLetter();
        assertEquals("*lm*",cl.changeVowels("alma"));
    }


}
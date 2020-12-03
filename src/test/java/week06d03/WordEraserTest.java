package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEraserTest {

    WordEraser we = new WordEraser();

    @Test
    void testWordEraserNotAround() {
        String result = we.eraseWord("banán körte alma alma barack alma banán", "alma");
        assertEquals("banán körte barack banán", result);
    }

    @Test
    void testWordEraserHavingTargetAround() {
        String result = we.eraseWord("alma körte alma alma barack alma", "alma");
        assertEquals("körte barack", result);
    }

    @Test
    void testEnhancedNotAround() {
        String result = we.eraseWordEnhanced("banán körte alma alma barack alma banán", "alma");
        assertEquals("banán körte barack banán", result);
    }

    @Test
    void testEnhancedHavingTargetAround() {
        String result = we.eraseWordEnhanced("alma körte alma alma barack alma", "alma");
        assertEquals("körte barack", result);
    }
}
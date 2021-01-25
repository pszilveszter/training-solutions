package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorldFilterTest {

    @Test
    void testFilter() {
        WorldFilter obj = new WorldFilter();
        List<String> words = List.of("alma", "narancs", "körte", "barack");
        assertEquals(List.of("alma", "narancs", "barack"), obj.wordsWithChar(words, 'a'));
    }

    @Test
    void testEmpty() {
        WorldFilter obj = new WorldFilter();
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> obj.wordsWithChar(new ArrayList<>(), 'e'));
        assertEquals("Missing input", ex.getMessage());
    }
}
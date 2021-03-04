package week14d01;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void testIndex() {
        Map<Character, List<String>> data = new Indexer().index(List.of("Edina", "Liza", "Eszter", "Emese", "Anikó"));
        assertEquals(3, data.size());
        assertEquals(3, data.get('E').size());
        assertEquals("Emese", data.get('E').get(2));
    }
}
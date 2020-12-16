package week08d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    List<String> a = Arrays.asList("alma","körte", "alma");
    List<String> b = Arrays.asList("barack","körte", "szilva");
    List<String> expected = Arrays.asList("alma", "körte", "barack", "szilva");

    @Test
    void testStringLists() {
        List<String> result = new StringLists().stringListsUnion(a,b);
        assertEquals(expected, result);
    }


}
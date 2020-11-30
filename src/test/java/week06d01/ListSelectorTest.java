package week06d01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {
    @Test
    void testAdd() {
        List<String> testInput = new ArrayList<>();
        testInput.add("alma");
        testInput.add("banán");
        testInput.add("körte");
        assertEquals("[alma,körte]", new ListSelector().evenString(testInput));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, ()-> new ListSelector().evenString(null));
    }

    @Test
    void testEmpty() {
        assertEquals("",new ListSelector().evenString(new ArrayList<>()));
    }

}
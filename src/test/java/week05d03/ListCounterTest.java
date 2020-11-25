package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ListCounterTest {
    @Test
    void testListCounter() {
        ListCounter lc = new ListCounter();
        List<String> testList = Arrays.asList("alma", "körte", "András");

        assertEquals(2,lc.countStringBeginsWithA(testList));
        assertEquals(0,lc.countStringBeginsWithA(new ArrayList<>()));

    }


}
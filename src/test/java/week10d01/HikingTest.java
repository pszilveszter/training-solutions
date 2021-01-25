package week10d01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testSumElevation() {
        Hiking hiking = new Hiking();
        List<Double> elevation = List.of(10d, 20d, 15d, 18d);
        assertEquals(13, hiking.getPlusElevation(elevation));
    }

}
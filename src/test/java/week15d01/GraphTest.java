package week15d01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {


    @Test
    void testGraph() {
        Map<Integer, Integer> points = new HashMap<>();
        points.put(-4, -6);
        points.put(-9, -11);
        points.put(-1, 7);
        points.put(3, 8);
        points.put(3, -2);
        points.put(1, 15);

        Graph input = new Graph();
        assertEquals(1, input.getMaxPoint(points).getKey());
        assertEquals(15, input.getMaxPoint(points).getValue());

    }

}
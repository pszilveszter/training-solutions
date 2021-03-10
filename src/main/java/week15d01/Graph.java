package week15d01;

import java.util.Map;

public class Graph {

    public Map.Entry<Integer, Integer> getMaxPoint(Map<Integer, Integer> coordinates) {
        if (coordinates.isEmpty()) {
            throw new IllegalArgumentException("Empty input");
        }

        Map.Entry<Integer, Integer> result = null;
        for (Map.Entry<Integer, Integer> entry: coordinates.entrySet()) {
            if (result == null || result.getValue() < entry.getValue()) {
                result = entry;
            }
        }
        return result;
    }
}

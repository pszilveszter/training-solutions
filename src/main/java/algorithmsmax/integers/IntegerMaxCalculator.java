package algorithmsmax.integers;

import java.util.LinkedList;
import java.util.List;

public class IntegerMaxCalculator {
    public int max(List<Integer> i) {
        int max = Integer.MIN_VALUE;
        for (int m : i) {
            if (m > max) {
                max = m;
            }
        }
        return max;
    }
}

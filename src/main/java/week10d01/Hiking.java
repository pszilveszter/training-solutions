package week10d01;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> elevations) {
        if (elevations == null || elevations.isEmpty()) {throw new IllegalArgumentException("Valid list is expected"); }
        double totalElevation = 0d;
        for (int i = 1; i < elevations.size(); i++) {
            if (elevations.get(i) > elevations.get(i - 1)) {
                totalElevation += (elevations.get(i) - elevations.get(i - 1));
            }
        }
        return totalElevation;
    }
}

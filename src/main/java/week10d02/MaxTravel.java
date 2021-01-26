package week10d02;

import java.util.List;

public class MaxTravel {
    int[][] stops = new int[30][2];


    public int getMaxIndex(List<Integer> passengers) {
        if (passengers == null || passengers.isEmpty()) {
            throw new IllegalArgumentException("Missing or emtpy list of integer values");
        }
        setStops(passengers);

        int[] mostNeeded = new int[2]; // 0 - busNumber; 1 - Awaiting passengers
        for (int[] stop: stops) {
            if (stop[1] > mostNeeded[1]) {
                mostNeeded[0] = stop[0];
                mostNeeded[1] = stop[1];
            }
        }
        return mostNeeded[0];
    }

    private void setStops(List<Integer> passengers) {
        for (int i : passengers) {
            int index = findIndex(i); // 0 - busNumber; 1 - Awaiting passengers
            stops[index][0] = i;
            stops[index][1]++;
        }
    }

    private int findIndex(int i) {
        for (int index = 0; index < stops.length; index++) {
            if (stops[index][0] == i) {
                return index;
            }
            if (stops[index][1] == 0) {
                return index;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Limit exceeded, no more than 30 bus is accepted!");
    }


}

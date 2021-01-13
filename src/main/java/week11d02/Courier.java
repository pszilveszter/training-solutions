package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }


    public void addRide(Ride ride) {
        if ((rides.isEmpty() && ride.getNr() == 1) || (!rides.isEmpty() && validNextRide(ride))) {
            rides.add(ride);
            return;
        }
        throw new IllegalArgumentException("Input mismatch!");
    }


    public int getNonWorkDay() {
        if (rides.get(0).getDay() > 1) {
            return 1;
        }

        for (int i = 1; i < rides.size(); i++) {
            if ((rides.get(i).getDay() - rides.get(i - 1).getDay()) > 1) {
                return rides.get(i - 1).getDay() + 1;
            }

        }

        return -1;
    }


    private boolean validNextRide(Ride ride) {
        Ride lastRide = rides.get(rides.size() - 1);
        boolean isSameDay = ride.getDay() == lastRide.getDay();
        boolean isDayAfter = ride.getDay() > lastRide.getDay();
        boolean isValidNextRun = ride.getNr() == lastRide.getNr() + 1;
        return (isSameDay && isValidNextRun) || (isDayAfter && ride.getNr() == 1);
     }
}

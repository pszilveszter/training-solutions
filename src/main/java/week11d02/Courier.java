package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (rides.size() == 0 || valid(ride)) {
            rides.add(ride);
            return;
        }
        throw new IllegalArgumentException("Invalid input!");
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

    private boolean valid(Ride ride) {
        Ride lastRide = rides.get(rides.size() - 1);
        if (lastRide.getDay() < ride.getDay()) {
            return true;
        }

        if (lastRide.getDay() == ride.getDay() && lastRide.getNr() < ride.getNr()) {
            return true;
        }

        return false;
    }


}

package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance;
    private int azimut;
    private List<NavigationPoint> navigationPoints = new ArrayList<>();


    public Robot go(int meter) {
        distance += meter;
        return this;
    }


    public Robot rotate(int angle) {
        azimut += angle;
        return this;
    }


    public Robot registerNavigationPoint() {
        NavigationPoint np = new NavigationPoint(distance, azimut);
        navigationPoints.add(np);
        return this;
    }


    public String getNavigationList() {
        return navigationPoints.toString();
    }

    public int getDistance() {
        return distance;
    }


    public int getAzimut() {
        return azimut;
    }

}

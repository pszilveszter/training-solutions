package week11d02;

public class Ride {

    private int day;
    private int nr;
    private int distance;

    public Ride(int day, int nr, int distance) {
        this.day = day;
        this.nr = nr;
        this.distance = distance;
    }

    public int getDay() {
        return day;
    }

    public int getNr() {
        return nr;
    }

    public int getDistance() {
        return distance;
    }
}

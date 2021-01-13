package week11d02;

public class Ride {

    public static final int MIN_DAY_OF_RIDE = 1;
    public static final int MAX_DAY_OF_RIDE = 7;

    private final int day;
    private final int nr;
    private final int distance;

    public Ride(int day, int nr, int distance) {
        if (!isValidDay(day)) {
            throw new IllegalArgumentException("Input mismatch! " + day + " is out of range");
        }
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

    private boolean isValidDay(int number) {
        return number >= MIN_DAY_OF_RIDE && number <= MAX_DAY_OF_RIDE;
    }
}

package activity;

public class Coordinate {
    private final double latitude;
    private final double longitude;

    public Coordinate(double altitude, double longitude) {
        if (altitude < -90 || altitude > 90) {
            throw new IllegalArgumentException("Illegal altitude parameter " + altitude);
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Illegal longitude parameter " + longitude);
        }
        this.latitude = altitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

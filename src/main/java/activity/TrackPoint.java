package activity;

public class TrackPoint {
    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint otherPoint) {
        double latDistance = Math.toRadians(otherPoint.getCoordinate().getLatitude() - coordinate.getLatitude());
        double lonDistance = Math.toRadians(otherPoint.getCoordinate().getLongitude() - coordinate.getLongitude());
        double alpha = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(otherPoint.getCoordinate().getLatitude())) * Math.cos(Math.toRadians(coordinate.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double beta = 2000 * Math.atan2(Math.sqrt(alpha), Math.sqrt(1 - alpha));
        double gamma = Math.pow((6371 * beta), 2) + Math.pow(otherPoint.getElevation() - elevation, 2);
        return Math.sqrt(gamma);
    }
}

package activity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        double longitude = Double.MIN_VALUE;
        double latitude = Double.MIN_VALUE;
        for (TrackPoint tp: trackPoints) {
            if (tp.getCoordinate().getLongitude() > longitude) {
                longitude = tp.getCoordinate().getLongitude();
            }
            if (tp.getCoordinate().getLatitude() > latitude) {
                latitude = tp.getCoordinate().getLatitude();
            }
        }
        return new Coordinate(latitude, longitude);
    }

    public Coordinate findMinimumCoordinate() {
        double longitude = Double.MAX_VALUE;
        double latitude = Double.MAX_VALUE;
        for (TrackPoint tp: trackPoints) {
            if (tp.getCoordinate().getLongitude() < longitude) {
                longitude = tp.getCoordinate().getLongitude();
            }
            if (tp.getCoordinate().getLatitude() < latitude) {
                latitude = tp.getCoordinate().getLatitude();
            }
        }
        return new Coordinate(latitude, longitude);
    }

    public double getDistance() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            sum += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return sum;
    }

    public double getFullDecrease() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double eCurr =  trackPoints.get(i).getElevation();
            double ePrev = trackPoints.get(i - 1).getElevation();
            if (eCurr < ePrev) {
                sum -= eCurr - ePrev;
            }
        }
        return Math.abs(sum);
    }


    public double getFullElevation() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double eCurr =  trackPoints.get(i).getElevation();
            double ePrev = trackPoints.get(i - 1).getElevation();
            if (eCurr > ePrev) {
                sum += eCurr - ePrev;
            }
        }
        return sum;
    }


    public double getRectangleArea() {
        if (trackPoints.isEmpty() || trackPoints.size() < 3) {
            throw new IllegalArgumentException("Unable to draw a rectangle from the given TrackPoints: " + trackPoints.toString());
        }
        Coordinate min = findMinimumCoordinate();
        Coordinate max = findMaximumCoordinate();
        return (max.getLatitude() - min.getLatitude()) * (max.getLongitude() - min.getLongitude());
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public void loadFromGpx(InputStream is) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String input;
            Coordinate cord = null;
            while ((input = reader.readLine()) != null) {
                if (input.trim().startsWith("<trkpt")) {
                    String[] strData = input.split("\"");
                    cord = new Coordinate(Double.parseDouble(strData[1]), Double.parseDouble(strData[3]));
                }
                if (input.trim().startsWith("<ele>")) {
                    TrackPoint tp = new TrackPoint(cord, Double.parseDouble(input.substring(input.indexOf(">") + 1,input.lastIndexOf("<"))));
                    addTrackPoint(tp);
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Unable to read file", e);
        }
    }
}

package week13d02;

import java.time.LocalTime;

public class Flight {

    private final String number;
    private final FlightDirection direction;
    private final String city;
    private final LocalTime time;

    public Flight(String number, FlightDirection direction, String city, LocalTime time) {
        this.number = number;
        this.direction = direction;
        this.city = city;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public FlightDirection getDirection() {
        return direction;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }
}

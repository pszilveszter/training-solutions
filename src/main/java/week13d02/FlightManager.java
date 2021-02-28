package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FlightManager {

    List<Flight> flights = new ArrayList<>();

    public void readFromFile(BufferedReader reader) {
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                addFlight(data);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read", ioe);
        }
    }

    public FlightDirection directionStatistic() {
        int countArrival = 0;
        for (Flight f: flights) {
            if (FlightDirection.ARRIVAL.equals(f.getDirection())) {
                countArrival++;
            }
        }
        return flights.size() / 2 < countArrival ? FlightDirection.ARRIVAL: FlightDirection.DEPARTURE;
    }


    public Flight getByNumber(String number) {
        for (Flight f: flights) {
            if (number.equals(f.getNumber())) {
                return f;
            }
        }
        return null;
    }


    public List<Flight> getFlightsOfCity(String city, String direction) {
        if (city.isBlank() || direction.isBlank()) {
            throw new IllegalArgumentException("Empty string is not accepted");
        }

        List<Flight> result = new ArrayList<>();
        for (Flight f : flights) {
            if (city.equals(f.getCity()) && getFlightDirection(direction) == (f.getDirection())) {
                result.add(f);
            }
        }

        if (result.isEmpty()) {
            throw new IllegalArgumentException("No corresponding flight is found " + city + ", " + direction);
        }
        return result;
    }

    public Flight earliestFlight() {
        Flight first = null;
        for (Flight f: flights) {
            if (first == null || first.getTime().isAfter(f.getTime())) {
                first = f;
            }
        }
        return first;
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }


    private void addFlight(String... s) {
        flights.add(new Flight(s[0], getFlightDirection(s[1]), s[2], LocalTime.parse(s[3], DateTimeFormatter.ofPattern("H:m"))));
    }


    private FlightDirection getFlightDirection(String input) {
        for (FlightDirection dir: FlightDirection.values()) {
            if (input.equals(dir.getName())) {
                return dir;
            }
        }
        throw new IllegalArgumentException("Unable to match direction");
    }
}

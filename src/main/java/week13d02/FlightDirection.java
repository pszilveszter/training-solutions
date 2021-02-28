package week13d02;

public enum FlightDirection {
    ARRIVAL ("Arrival"), DEPARTURE("Departure");

    private String name;

    FlightDirection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

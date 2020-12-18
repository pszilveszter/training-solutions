package inheritanceconstructor.classroom;

public class Room {

    private String location;
    private int capacity;

    public Room(String location, int capacity) {
        if (isEmpty(location)) {
            throw new IllegalArgumentException("Invalid location attribute!");
        }
        this.location = location;
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}

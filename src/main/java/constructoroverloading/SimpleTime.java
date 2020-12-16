package constructoroverloading;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || hours > 23 || minutes > 59) {
            throw new IllegalArgumentException("Input mismatch");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.getHours(), time.getMinutes());
    }


    public int difference(SimpleTime time) {
        return (hours * 60 + minutes) - (time.getHours() * 60 + time.getMinutes());
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}

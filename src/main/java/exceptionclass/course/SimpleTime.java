package exceptionclass.course;

public class SimpleTime {
    private short hour;
    private short minute;

    public SimpleTime(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    public SimpleTime(String time) {
        if (time == null || time.isBlank()) {
            throw new InvalidTimeException("Time is null");
        }
        int h;
        int m;
        try {
            h = Integer.parseInt(time.substring(0,time.indexOf(':')));
            m = Integer.parseInt(time.substring(time.indexOf(':') + 1));
        }
        catch (NumberFormatException | StringIndexOutOfBoundsException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        setHour(h);
        setMinute(m);
    }

    public short getHour() {
        return hour;
    }

    public short getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        this.hour = (short)hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.minute = (short)minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", getHour(), getMinute());
    }
}

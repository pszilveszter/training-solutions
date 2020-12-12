package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours >= 24 || hours < 0) {
            throw new IllegalArgumentException(hours + " hour is not a valid represenation of time");
        }
        if (minutes >= 60 || minutes < 0) {
            throw new IllegalArgumentException(minutes + " minute is not a valid represenation of time");
        }
        if (seconds >= 60 || seconds < 0) {
            throw new IllegalArgumentException(seconds + " second is not a valid represenation of time");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public Time(int hours, int minutes) {
        if (hours >= 24 || hours < 0) {
            throw new IllegalArgumentException(hours + " hour is not a valid represenation of time");
        }
        if (minutes >= 60 || minutes < 0) {
            throw new IllegalArgumentException(minutes + " minute is not a valid represenation of time");
        }
        this.hours = hours;
        this.minutes = minutes;
    }


    public Time(int hours) {
        if (hours >= 24 || hours < 0) {
            throw new IllegalArgumentException(hours + " hour is not a valid represenation of time");
        }
        this.hours = hours;
    }


    public Time(Time time) {
        hours = time.getHours();
        minutes = time.getMinutes();
        seconds = time.getSeconds();
    }


    public boolean isEqual(Time time) {
        return totalInSeconds(hours, minutes, seconds) == totalInSeconds(time.getHours(), time.getMinutes(), time.getSeconds());
    }


    public boolean isEqual(int hours, int minutes, int seconds) {
        return totalInSeconds(this.hours, this.minutes, this.seconds) == totalInSeconds(hours, minutes, seconds);
    }


    public boolean isEarlier(Time time) {
        return totalInSeconds(hours, minutes, seconds) < totalInSeconds(time.getHours(), time.getMinutes(), time.getSeconds());
    }


    public boolean isEarlier(int hours, int minutes, int seconds) {
        return totalInSeconds(this.hours, this.minutes, this.seconds) < totalInSeconds(hours, minutes, seconds);
    }

    private int totalInSeconds(int h, int m, int s) {
        return s + 60 * (m + 60 * h);
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}

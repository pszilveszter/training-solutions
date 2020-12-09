package week07d03;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    private Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static Date addDate(int year, int month, int day) {
        return new Date(year,month,day);
    }

    public Date withYear(int year) {
        return addDate(year, getMonth(), getDay());
    }

    public Date withMonth(int month) {
        return addDate(getYear(), month, getDay());
    }

    public Date withDay(int day) {
        return addDate(getYear(),getMonth(), day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}

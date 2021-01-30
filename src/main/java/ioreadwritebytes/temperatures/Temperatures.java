package ioreadwritebytes.temperatures;

public class Temperatures {

    private static final int LENGHT_OF_MONTH = 30;

    private final byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data.clone();
    }

    public double getYearAverage() {
        double sum = 0;
        for (byte celsius : data) {
            sum += celsius;
        }
        return sum / data.length;
    }

    public double getMonthAverage() {
        double sum = 0;
        byte celsius;
        for (int i = data.length; i > data.length - LENGHT_OF_MONTH; i--) {
            celsius = data[i - 1];
            sum += celsius;
        }
        return sum / LENGHT_OF_MONTH;
    }


}

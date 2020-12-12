package methodparam.measuring;

public class Measurement {

    private double[] result;

    public Measurement(double[] result) {
        if (result == null || result.length == 0) {
            throw new IllegalArgumentException();
        }
        this.result = result;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0; i < result.length; i++) {
            if (lower < result[i] && upper > result[i]) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double min = Double.MAX_VALUE;
        for (double d: result) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double maximum() {
        double max = Double.MIN_VALUE;
        for (double d: result) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }
}

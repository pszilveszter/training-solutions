package methodparam.measuring;

public class ExtremValues {

    private final double min;
    private final double max;

    public ExtremValues(double minimum, double maximum) {
        min = minimum;
        max = maximum;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}

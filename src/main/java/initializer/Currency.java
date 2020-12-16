package initializer;

public enum Currency {
    HUF(1.0),
    EUR(308.23),
    SFR(289.24),
    GBP(362.23),
    USD(289.77);

    private double conversionRate;

    Currency(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}

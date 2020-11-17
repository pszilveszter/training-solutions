package enumtype.unit;

public enum LenghtUnit {
    MILLIMETER(true,1D),
    CENTIMETER(true, 10D),
    METER(true,1000D),
    YARD(false,914.4),
    FOOT(false,304.8),
    INCH(false,25.4);
    
    private final boolean si;
    private final double exchangeRate2MM;

    LenghtUnit(boolean si, double exchangeRate2MM) {
        this.si = si;
        this.exchangeRate2MM = exchangeRate2MM;
    }
    
    public boolean isSI() {
        return si;
    }
    
    public double getExchangeRate2MM() {
        return exchangeRate2MM;
    }
}

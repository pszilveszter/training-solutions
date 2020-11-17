package enumtype.unit;

import java.util.ArrayList;
import java.util.List;

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

    // Hol lenne a nextDay() valamint a siUnits() metódus helye? Hogy lehet ezt ott definiálni, ha nem példányhoz, hanem osztályhoz tartozik? Hogy lehet meghívni?
    // A metódus helye a LenghtUnit enum-ba jobban illeszkedik, de public staticnak kell lennie a módosítóknak
    // Meghívni pedig az osztályon keresztül lehet
    public static List<LenghtUnit> siUnits() {
        List<LenghtUnit> units = new ArrayList<>();
        for (LenghtUnit l : LenghtUnit.values()) {
            if (l.isSI()) {
                units.add(l);
            }
        }
        return units;
    }
}

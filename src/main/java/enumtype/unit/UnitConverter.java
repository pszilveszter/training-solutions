package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {
    public static final List<LenghtUnit> SIUNITS = siUnits();

    public BigDecimal convert(BigDecimal lenght, LenghtUnit source, LenghtUnit target) {
        double rate = source.getExchangeRate2MM();
        BigDecimal lenghtInMillimeter = lenght.multiply(BigDecimal.valueOf(rate));
        rate = target.getExchangeRate2MM();
        return lenghtInMillimeter.divide(BigDecimal.valueOf(rate), 4, RoundingMode.HALF_UP);
    }

    // Hol lenne a nextDay() valamint a siUnits() metódus helye? Hogy lehet ezt ott definiálni, ha nem példányhoz, hanem osztályhoz tartozik? Hogy lehet meghívni?
    // A metódus helye rendben van, de értékeit bele lehet rakni az osztály attrib listájába kvázi konstans értékként, melyet az osztály első meghívásakor töltünk fel értékekkel
    // Meghívni pedig az osztályon keresztül lehet
    private static List<LenghtUnit> siUnits() {
        List<LenghtUnit> units = new ArrayList<>();
        for (LenghtUnit l : LenghtUnit.values()) {
            if (l.isSI()) {
                units.add(l);
            }
        }
        return units;
    }
}

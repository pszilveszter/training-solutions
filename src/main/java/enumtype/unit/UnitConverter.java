package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public BigDecimal convert(BigDecimal lenght, LenghtUnit source, LenghtUnit target) {
        double rate = source.getExchangeRate2MM();
        BigDecimal lenghtInMillimeter = lenght.multiply(BigDecimal.valueOf(rate));
        rate = target.getExchangeRate2MM();
        return lenghtInMillimeter.divide(BigDecimal.valueOf(rate), 4, RoundingMode.HALF_UP);
    }

    public List<LenghtUnit> siUnits() {
        List<LenghtUnit> units = new ArrayList<>();
        for (LenghtUnit l : LenghtUnit.values()) {
            if (l.isSI()) {
                units.add(l);
            }
        }
        return units;
    }
}

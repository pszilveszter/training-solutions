package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UnitConverter {

    public BigDecimal convert(BigDecimal lenght, LenghtUnit source, LenghtUnit target) {
        double rate = source.getExchangeRate2MM();
        BigDecimal lenghtInMillimeter = lenght.multiply(BigDecimal.valueOf(rate));
        rate = target.getExchangeRate2MM();
        return lenghtInMillimeter.divide(BigDecimal.valueOf(rate), 4, RoundingMode.HALF_UP);
    }
}

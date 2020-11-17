package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter converter = new UnitConverter();
        System.out.println(converter.convert(BigDecimal.valueOf(1563.349971),LenghtUnit.FOOT, LenghtUnit.YARD));
        System.out.println(Arrays.asList(LenghtUnit.values()));
        System.out.println(converter.siUnits());
    }
}

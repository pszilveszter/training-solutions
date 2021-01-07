package interfacestaticmethods;

import java.util.List;

public interface Valued {

    static double totalValue(List<Valued> items) {
        return sum(items);
    }

    double getValue();

    static double sum(List<Valued> valuedList) {
        double sum = 0;
        for (Valued v : valuedList) {
            sum += v.getValue();
        }
        return sum;
    }

}

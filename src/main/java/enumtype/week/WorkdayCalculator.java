package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {

        List<DayType> typeOfDays = new ArrayList<>();
        Day actualDay = firstDay;
            for (int i = 0; i < numberOfDays; i++) {
                typeOfDays.add(actualDay.getTypeOfDay());
                actualDay = Day.nextDay(actualDay); // Az osztályon keresztül történik a hívás az aktuális nap paraméterként történő átadásával
            }
        return typeOfDays;
    }
}

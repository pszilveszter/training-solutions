package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {

        List<DayType> typeOfDays = new ArrayList<>();
        Day actualDay = firstDay;
            for (int i = 0; i < numberOfDays; i++) {
                typeOfDays.add(actualDay.getTypeOfDay());
                actualDay = nextDay(actualDay);
            }
        return typeOfDays;
    }

    private Day nextDay(Day day) {
        int dayPos = day.ordinal();
        if (dayPos < Day.values().length - 1) {
            dayPos++;
        } else {
            dayPos = 0;
        }

        for (Day d : Day.values()) {
            if (d.ordinal() == dayPos) {
                return d;
            }
        }
        return null;
    }
}

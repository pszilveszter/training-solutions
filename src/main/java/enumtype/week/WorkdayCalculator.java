package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    // Hol lenne a nextDay() valamint a siUnits() metódus helye? Hogy lehet ezt ott definiálni, ha nem példányhoz, hanem osztályhoz tartozik? Hogy lehet meghívni?
    // A metódus helye rendben van, de értékeit bele lehet rakni az osztály attrib listájába kvázi konstans értékként, melyet az osztály első meghívásakor töltünk fel értékekkel
    // Meghívni pedig az osztályon keresztül lehet, vagy példány metódusán keresztül lehet
    public static final Day[][] NEXTDAY = new Day[7][2];

    public WorkdayCalculator() {
        Day actualDay = Day.MONDAY;
        for (int i = 0; i < Day.values().length; i++) {
            NEXTDAY[i][0] = actualDay;
            NEXTDAY[i][1] = nextDay(actualDay);
            actualDay = NEXTDAY[i][1];
        }
    }

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {

        List<DayType> typeOfDays = new ArrayList<>();
        Day actualDay = firstDay;
            for (int i = 0; i < numberOfDays; i++) {
                typeOfDays.add(actualDay.getTypeOfDay());
                actualDay = NEXTDAY[actualDay.ordinal()][1];
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

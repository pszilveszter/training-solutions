package enumtype.week;

public enum Day {
    MONDAY(DayType.WORKDAY),
    TUESDAY(DayType.WORKDAY),
    WEDNESDAY(DayType.WORKDAY),
    THURSDAY(DayType.WORKDAY),
    FRIDAY(DayType.WORKDAY),
    SATURDY(DayType.HOLIDAY),
    SUNDAY(DayType.HOLIDAY);

    private final DayType typeOfDay;

    Day(DayType typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public DayType getTypeOfDay() {
        return typeOfDay;
    }

    // Hol lenne a nextDay() valamint a siUnits() metódus helye? Hogy lehet ezt ott definiálni, ha nem példányhoz, hanem osztályhoz tartozik? Hogy lehet meghívni?
    // A metódus helye az enumba jobban illeszkedik, de láthatósága publikus kell legyen, illetve static, hogy az osztályhoz tartozó legyen
    // Meghívható az osztályon keresztül a nap paraméterben történő megadásával
    public static Day nextDay(Day day) {
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

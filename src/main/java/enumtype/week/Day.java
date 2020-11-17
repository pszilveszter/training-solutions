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
}

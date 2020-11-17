package enumtype.week;

public class WorkdayCalculatorMain {
    public static void main(String[] args) {
        Day day = Day.THURSDAY;
        int countOfDays = 11;
        System.out.println(new WorkdayCalculator().dayTypes(day, countOfDays));
    }
}

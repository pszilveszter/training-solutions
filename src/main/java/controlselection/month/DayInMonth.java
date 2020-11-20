package controlselection.month;

public class DayInMonth {

    public static int daysInMonth(int year, String month) {

        int days;

        switch (month.toLowerCase()) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                days = 31;
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                days = 30;
                break;
            case "február":
                boolean leapYear = false;
                if (year % 4 == 0) {
                    leapYear = (year % 100 == 0 & year % 400 == 0) || (year % 100 > 0 & year % 400 > 0);
                }

                days = leapYear ? 29 : 28;
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
        return days;
    }
}

package controlselection.week;

public class DayOfWeeks {
    public static String whichDay(String day) {
        String message;
        switch (day.toLowerCase()) {
            case "hétfő":
                message = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                message = "hét közepe";
                break;
            case "péntek":
                message = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                message = "hét vége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
        return message;
    }
}

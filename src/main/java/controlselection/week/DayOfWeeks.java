package controlselection.week;

public class DayOfWeeks {
    public static String evaulateDay(String day) {
        String message;
        switch (day.toLowerCase()) {
            case "hétfő":
                message = "Hét eleje";
                break;
            case "kedd":
            case "szedra":
            case "csütörtök":
                message = "Hét közepe";
                break;
            case "péntek":
                message = "Majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                message = "Hétvége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
        return message + " van";
    }
}

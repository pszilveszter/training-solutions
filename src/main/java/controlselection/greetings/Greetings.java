package controlselection.greetings;

public class Greetings {
    public static final int CONVERTRATE = 60;

    public String greet(int hour, int minute) {
        int timeInMinute = hour * CONVERTRATE + minute;

        if (timeInMinute > 20 * CONVERTRATE || timeInMinute < 5 * CONVERTRATE + 1) {
            return "jó éjt";
        } else if (timeInMinute > 18 * CONVERTRATE + 30) {
            return "jó estét";
        } else if (timeInMinute > 9 * CONVERTRATE) {
            return "jó napot";
        } else {
            return "jó reggelt";
        }
    }
}

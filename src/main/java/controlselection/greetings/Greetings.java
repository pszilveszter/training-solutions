package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    public String greeting(LocalTime time) {
        String greetingByTime = null;

        if (time.isAfter(LocalTime.of(20,0)) || time.isBefore(LocalTime.of(5,1))) {
            greetingByTime = "Jó éjt";
        } else if (time.isAfter(LocalTime.of(18,30))) {
            greetingByTime = "Jó estét";
        } else if (time.isAfter(LocalTime.of(9,0))) {
            greetingByTime = "Jó napot";
        } else if (time.isAfter(LocalTime.of(5,0))) {
            greetingByTime = "Jó reggelt";
        }

        return greetingByTime;
    }




}

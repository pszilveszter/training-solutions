package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {

    private List<Schedule> schedules = new ArrayList<>();


    public ScheduleManager(BufferedReader reader) {
        Schedule s;
        while ((s = readBlock(reader)) != null) {
            schedules.add(s);
        }
    }


    public int readHoursOfTeacher(String teacher) {
        if (teacher == null || teacher.isBlank()) {
            throw new IllegalArgumentException("Valid input is expected");
        }

        int sumOfHours = 0;
        for (Schedule s: schedules) {
            if (teacher.equals(s.getTeacher())) {
                sumOfHours += s.getHours();
            }
        }
        return sumOfHours;
    }


    private Schedule readBlock(BufferedReader reader) {
        try {
            String name;
            if ((name = reader.readLine()) != null) {
                String course = reader.readLine();
                String classId = reader.readLine();
                int hours = Integer.parseInt(reader.readLine());
                return new Schedule(name, course, classId, hours);
            }
            return null;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read data", ioe);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Bad data format", nfe);
        }
    }
}

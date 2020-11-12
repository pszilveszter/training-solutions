package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println("\t" + meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size(); i > 0; i--) {
            MeetingRoom meetingRoom = meetingRooms.get(i - 1);
            System.out.println("\t" + meetingRoom.getName());
        }
    }

    public void printEvenNames() {
        if (meetingRooms.size() < 2) {
            System.out.println("\tMásodik tárgyaló nem került rögzítésre");
        } else {
            for (int i = 1; i < meetingRooms.size(); i = i + 2) {
                MeetingRoom meetingRoom = meetingRooms.get(i);
                System.out.println("\t" + meetingRoom.getName());
            }
        }
    }

    public void printAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            String message = "\t" + meetingRoom.getName() +
                    " - szél.: " + meetingRoom.getWidth() +
                    "m; hossz.: " + meetingRoom.getLenght() +
                    "m; ter: " + meetingRoom.getArea() + " nm";
            System.out.println(message);
        }
    }

    public void printMeetingRoomsWithName(String name) {
        int found = 0;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                found++;
                System.out.println("\tszél.: " + meetingRoom.getWidth() +
                        "m; hossz.: " + meetingRoom.getLenght() +
                        "m; ter: " + meetingRoom.getArea() + " nm");
            }
        }
        if (found == 0) {
            System.out.println("\tNincs találat!");
        }
    }

    public void printMeetingRoomsContains(String part) {
        int found = 0;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().indexOf(part.toLowerCase()) > -1) {
                found++;
                System.out.println("\tszél.: " + meetingRoom.getWidth() +
                        "m; hossz.: " + meetingRoom.getLenght() +
                        "m; ter: " + meetingRoom.getArea() + " nm");
            }
        }
        if (found == 0) {
            System.out.println("\tNincs találat!");
        }
    }

    public void printAreasLargerThan(int area) {
        int found = 0;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                found++;
                String message = "\t" + meetingRoom.getName() +
                        " - szél.: " + meetingRoom.getWidth() +
                        "m; hossz.: " + meetingRoom.getLenght() +
                        "m; ter: " + meetingRoom.getArea() + " nm";
                System.out.println(message);
            }
        }
        if (found == 0) {
            System.out.println("\tNincs találat!");
        }
    }
}

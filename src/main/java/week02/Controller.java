package week02;

import java.util.Scanner;

public class Controller {
    private Office office = new Office();

    public static void main(String[] args) {
            Controller controller = new Controller();
            controller.readOffice();
            controller.printMenu();
            controller.runMenu();
    }


    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A rögzíteni kívánt tárgyalók száma?");
        int nRooms = scanner.nextInt();
        scanner.nextLine();

        if  (nRooms > 0) {
            for (int i = 0; i < nRooms; i++) {
                System.out.println("Tárgyaló neve");
                String name = scanner.nextLine();
                System.out.println("Tárgyaló szélessége méterben");
                int width = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Tárgyaló hosszúsága méterben");
                int lenght = scanner.nextInt();
                scanner.nextLine();

                MeetingRoom meetingRoom = new MeetingRoom(name, lenght, width);
                office.addMeetingRoom(meetingRoom);
            }
            System.out.println("*** Tárgyalók rögzítve! ***\nKérem válaszon művelete a következőt menüből!");
        } else {
            readOffice();
        }

    }

    public void printMenu() {
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");
    }


    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        scanner.nextLine();

        if (selection > 0 && selection < 8) {
            if (selection > 6) {
                System.out.println("*** Keresés terület alapján ***");
                System.out.println("A keresés alsó határa?");
                int min = scanner.nextInt();
                office.printAreasLargerThan(min);
            } else if (selection > 5) {
                System.out.println("*** Keresés névtöredék alapján ***");
                System.out.println("A keresett kifejezés?");
                String search = scanner.nextLine();
                office.printMeetingRoomsContains(search);
            } else if (selection > 4) {
                System.out.println("*** Keresés pontos név alapján ***");
                System.out.println("A keresett tárgyaló neve?");
                String search = scanner.nextLine();
                office.printMeetingRoomsWithName(search);
            } else if (selection > 3) {
                System.out.println("*** Területek ***");
                office.printAreas();
            } else if (selection > 2) {
                System.out.println("*** Minden második tárgyaló ***");
                office.printEvenNames();
            } else if (selection > 1) {
                System.out.println("*** Tárgyalók visszafele sorrendben ***");
                office.printNamesReverse();
            } else {
                System.out.println("*** Tárgyalók sorrendben ***");
                office.printNames();
            }
        }
    }
}

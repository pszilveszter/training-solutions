package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boat1 = 5;
        int boat2 = 3;
        int boat3 = 2;

        int capacity = 10;
        int avalableBoats = 3;

        System.out.println("Az érkező csapat létszáma?");
        int group = scanner.nextInt();

        System.out.println("Kiadott csónakok:");
        if (group > boat2) {
            System.out.println("\tAz " + boat1 + " személyes");
            capacity -= boat1;
            avalableBoats--;
            group -= boat1;
        }
        if (group > boat3) {
            System.out.println("\tA " + boat2 + " személyes");
            capacity -= boat2;
            avalableBoats--;
            group -= boat2;
        }
        if (group > 0) {
            System.out.println("\tA " + boat3 + " személyes");
            avalableBoats--;
            capacity -= boat3;
            group -= boat3;
        }

        if (group > 0) {
            System.out.println(group + " ember maradt a parton");
        } else {
            System.out.println("Még " + capacity + " ember hajózhat ki, " + avalableBoats + " darab hajóban");
        }


/*      // Első megoldás
        if (group <= 2 && group > 0) {
            System.out.println("A 2 szmélyes hajót adtuk ki, még 8 ember tud kihajózni 2 csónakban");
        }
        if (group == 3) {
            System.out.println("A 3 személyes hajót adtuk ki, még 7 ember tud kihajózni 2 csónakban");
        }
        if (group == 4 || group == 5) {
            System.out.println("Az 5 személyes hajót adtuk ki, még 5 ember tud kihajózni 2 csónakban");
        }
        if (group == 6 || group == 7) {
            System.out.println("Az 5 és a 2 személyes hajókat adtuk ki, még 3 ember tud kihajózni 1 csónakban");
        }
        if (group == 8) {
            System.out.println("Az 5 és a 3 személyes hajókat adtuk ki, még 2 ember tud kihajózni 1 csónakban");
        }
        if (group > 8) {
            System.out.println("Minden hajót kiadtunk, nem tud több ember kihajózni;");
            if (group > 10) {
                System.out.println(group - 10 + " ember a parton maradt");
            }
        }
*/

    }
}

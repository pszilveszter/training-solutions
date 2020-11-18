package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        int i = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        boolean b = false;
        int t = 0;
        for (int k = 0; k < 7; k++) {
            System.out.println("Tipp nr. " + (k + 1) + ":");
            t = sc.nextInt();
            sc.nextLine();
            if (t == i) {
                b = true;
            } else {
                if (t < i) {
                    System.out.println("*** Nagyobb számra gondoltam ***");
                } else {
                    System.out.println("*** Kisebb számra gondoltam ***");
                }
            }
        }
        System.out.println(b ? "*** KITALÁLTAD, a helyes tipp " + i + " ***" : "VÉGE, sajnos nem nyert");
    }
}

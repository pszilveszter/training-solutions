package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        int i = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        boolean b = false;
        int t = 0;
        while (!b) {
            System.out.println("*** Tipp: ***");
            t = sc.nextInt();
            sc.nextLine();
            if (t == i) {
                b = true;
            } else {
                System.out.println("*** tévedés, nem talált :-D ***");
            }
        }
        System.out.println("*** KITALÁLTAD, a helyes tipp " + i + " ***");
    }
}

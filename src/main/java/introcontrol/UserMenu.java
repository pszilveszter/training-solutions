package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v;

        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés\n" +
                "Írjon be egy számot");

        v = scanner.nextInt();
        if (v <= 2) {
            if (v == 1) {
                System.out.println("Felhasználók listázása");
            } else {
                System.out.println("Felhasználó felvétele");
            }
        }
    }
}

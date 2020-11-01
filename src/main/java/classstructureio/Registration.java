package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ez az osztály név és email adatokat kér be a felhasználótól!");
        System.out.println("Add meg a neved:");

        String name = scanner.nextLine();
        System.out.println("Add meg az email címed:");
        String email = scanner.nextLine();

        System.out.println("Regisztráció az alábbi adatokkal:");
        System.out.println("\tNév: " + name);
        System.out.println("\tEmail: " + email);

    }
}

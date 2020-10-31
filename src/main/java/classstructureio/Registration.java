package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This class gains name and email information from user");
        System.out.println("Please enter your name");

        String name = scanner.nextLine();
        System.out.println("Provide email address too");
        String email = scanner.nextLine();

        System.out.println("Registration requested with the following data:");
        System.out.println("\tName: " + name);
        System.out.println("\tEmail: " + email);

    }
}

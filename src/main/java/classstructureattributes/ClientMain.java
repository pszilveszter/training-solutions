package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        System.out.println("Ez az osztály a felhasználói inputoto egy osztályban hozza létre");

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Név megadása");
        client.name = scanner.nextLine();
        System.out.println("Születési év megadása");
        client.year = scanner.nextInt();
        System.out.println("Cím megadása");
        client.address = scanner.nextLine();
        client.address = scanner.nextLine();

        System.out.println("A megadott adatok:");
        System.out.println("\tNév: " + client.name);
        System.out.println("\tÉv: " + client.year);
        System.out.println("\tCím: " + client.address);
    }
}

package finalmodifier;

import java.util.Scanner;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Hello";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MESSAGE_PREFIX + "! Kérlek add meg a neved:");
        String name = scanner.nextLine();
        System.out.println(MESSAGE_PREFIX + " " + name);
    }
}

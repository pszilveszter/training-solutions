package finalmodifier;

import java.util.Scanner;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Hello";


    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        String name = new Gentleman().askName();
        gentleman.sayHello(name);
    }

    public void sayHello(String name) {
        System.out.println(MESSAGE_PREFIX + " " + name);
    }

    public String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(MESSAGE_PREFIX + "! Kérlek add meg a neved:");
        return scanner.nextLine();
    }
}

package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Ez az osztály a felhasználó által bevitt két egész szám összegét számolja ki!");
        System.out.println("Kérlek írd be az első számot:");
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        System.out.println("A második szám:");
        int numB = scanner.nextInt();

        System.out.println(numA + " + " + numB);
        System.out.println(numA + numB);
    }
}

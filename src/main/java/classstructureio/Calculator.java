package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("This class provides the summary of two integers that are based on user input!");
        System.out.println("Please enter the first number");
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        System.out.println("Enter the second number");
        int numB = scanner.nextInt();

        System.out.println(numA + " + " + numB);
        System.out.println(numA+numB);
    }
}

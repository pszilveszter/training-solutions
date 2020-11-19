package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double check = (0.3 / ((2D + 1) * (1 - 2) / (1 - 2) * (2 + 1)));
        //System.out.println(check);

        System.out.println("Na ezt találd ki! Mennyi az eredménye a 0.3 / ((2 + 1) * (1 - 2) / (1 - 2) * (2 + 1)) = ?");
        double guess = scanner.nextDouble();

        System.out.println(Math.abs(check - guess) < 1e-4 ? "EZ AZ!" : "SAJNOS NEM!");
    }
}

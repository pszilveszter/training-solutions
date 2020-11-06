package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(i +1 + ". szám");
            r = r + scanner.nextInt();
        }

        System.out.println("A számok összege: " + r);
    }
}

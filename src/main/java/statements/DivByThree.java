package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adj meg egy egész számot és én megmondom, hogy osztható e 3-al");
        int n = input.nextInt();

        System.out.println("A megadott szám " + (n % 3 == 0 ? "valóban osztható" : "sajnos nem osztható") + " 3-al");
    }
}

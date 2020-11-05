package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator validateInput = new UserValidator();

        System.out.println("Felhasználó név:");
        String inputN = scanner.nextLine();
        System.out.println(validateInput.isValidUsername(inputN) ? "Adat mentve" : "Hiányzó adat");

        System.out.println("Jelszó:");
        String inputPW1 = scanner.nextLine();
        System.out.println("Jelszó mégegszer:");
        String inputPW2 = scanner.nextLine();
        System.out.println(validateInput.isValidPassword(inputPW1, inputPW2) ? "Adat mentve" : "Hibás adat");
    }
}

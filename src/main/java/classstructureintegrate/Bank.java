package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Számlanyitás: Első számla");
        System.out.println("Számlatulajdonos neve:");
        String owner = scanner.nextLine();
        System.out.println("Számlaszám:");
        String accountNumber = scanner.nextLine();
        System.out.println("Nyitó egyenleg:");
        int value = scanner.nextInt();
        scanner.nextLine();

        BankAccount accountA = new BankAccount(accountNumber,owner,value);
        System.out.println("Új számla elkészült: " + accountA.getInfo());

        System.out.println("Számlanyitás: Második számla");
        System.out.println("Számlatulajdonos neve:");
        owner = scanner.nextLine();
        System.out.println("Számlaszám:");
        accountNumber = scanner.nextLine();
        System.out.println("Nyitó egyenleg:");
        value = scanner.nextInt();

        BankAccount accountB = new BankAccount(accountNumber,owner,value);
        System.out.println("Új számla elkészült: " + accountB.getInfo());

        System.out.println("Pénz befizetés az első számlára! Befizetni kívánt összeg?");
        value = scanner.nextInt();
        accountA.deposit(value);
        System.out.println(accountA.getInfo());

        System.out.println("Pénzfelvét a második számláról");
        value = scanner.nextInt();
        accountB.withdraw(value);
        System.out.println(accountB.getInfo());

        System.out.println("Átutalás az első számláról a másodikra");
        accountA.transfer(accountB, 1000000);
        System.out.println(accountA.getInfo());
        System.out.println(accountB.getInfo());
    }
}

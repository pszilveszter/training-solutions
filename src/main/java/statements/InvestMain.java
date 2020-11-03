package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mennyit szeretne befektetni?");
        int iFund = input.nextInt();
        System.out.println("Kamat?");
        int iInterest = input.nextInt();

        Investment inv = new Investment(iFund,iInterest);

        System.out.println(inv.getFund() + " értékű befektetés esetében");
        System.out.println("A számított kamat értéke 60 napra: " + inv.getYieald(60));
        System.out.println("Kifizetés 90 napra: " + inv.close(90));
        System.out.println("Ismételt kifizetés 120 napra: " + inv.close(120));
    }
}

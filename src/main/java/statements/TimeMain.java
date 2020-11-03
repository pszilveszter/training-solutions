package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int inputH, inputM, inputS;

        System.out.println("1-ső időpont bekérése - Óra");
        inputH = read.nextInt();
        System.out.println("1-ső időpont bekérése - Perc");
        inputM = read.nextInt();
        System.out.println("1-ső időpont bekérése - Másodperc");
        inputS = read.nextInt();

        Time timeA = new Time(inputH, inputM, inputS);

        System.out.println("2-ik időpont bekérése - Óra");
        inputH = read.nextInt();
        System.out.println("2-ik időpont bekérése - Perc");
        inputM = read.nextInt();
        System.out.println("2-ik időpont bekérése - Másodperc");
        inputS = read.nextInt();

        Time timeB = new Time(inputH, inputM, inputS);

        // Kiírás
        System.out.println("Az 1-ső időpont:\t" + timeA.toString() + " ami pontosan " + timeA.getInMinutes() + " perc");
        System.out.println("A 2-ik időpont: \t" + timeB.toString() + " ami pontosan " + timeB.getInSeconds() + " másodperc");
        System.out.println("Az 1-ső idpont a korábbi? " + (timeA.earlierThan(timeB) ? "Igen" : "Nem"));
    }
}

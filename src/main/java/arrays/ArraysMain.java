package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain array = new ArraysMain();

        System.out.println("numberOfDaysAsString");
        System.out.println(array.numberOfDaysAsString());

        System.out.println("\ndaysOfWeek");
        System.out.println(array.daysOfWeek());

        System.out.println("\nmultiplicationTableAsString");
        System.out.println(array.multiplicationTableAsString(5));

        System.out.println("\nsameTempValues");
        double[] day1 = {20.5, 20.8, 21.1, 21.3, 21.5, 21.8, 22.2, 22.7, 22.8, 23.1, 23.2, 23.3, 23.4, 23.4, 23.2, 23.1, 22.9, 22.6, 22.2, 21.7, 21.2, 20.9, 20.4};
        double[] day2 = {20.5, 20.8, 21.1, 21.3, 21.5, 21.8, 22.2, 22.7, 22.8, 23.1, 23.2, 23.3, 23.4, 23.4, 23.2, 23.1, 22.9, 22.6, 22.2, 21.7, 21.2, 20.9, 20.4};
        double[] day3 = {20.6, 20.8, 21.1, 21.3, 21.5, 21.8, 22.2, 22.7, 22.8, 23.1, 23.2, 23.3, 23.4, 23.4, 23.2, 23.1, 22.9, 22.6, 22.2, 21.7, 21.2, 20.9, 20.4};
        System.out.println(array.sameTempValues(day1, day2));
        System.out.println(array.sameTempValues(day2, day3));

        System.out.println("\nwonLottery"); //renzedési vizsgálat behúzással
        int[] bet = {88, 77, 4, 13, 23};
        int[] drawn = {23, 4, 88, 13, 77};
            int betSize = bet.length;
            int drawnSize = drawn.length;
            int[] betArchive = Arrays.copyOf(bet,betSize);
            int[] drawnArchive = Arrays.copyOf(drawn,drawnSize);

        System.out.println("Eredmény: " + array.wonLottery(bet, drawn));
            if (Arrays.equals(bet, betArchive) && Arrays.equals(drawn, drawnArchive)) {
                System.out.println("--- A rendezésnek immáron nincs visszahatása ---");
            } else {
                System.out.println("XXX A rendezésnek van visszahatása XXX");
            }
    }


    public boolean wonLottery(int[] betNumbers, int[] drawnNumbers) {
            int betSize = betNumbers.length;
            int drawnSize = drawnNumbers.length;
            int[] bet = Arrays.copyOf(betNumbers, betSize);
            int[] drawn = Arrays.copyOf(drawnNumbers, drawnSize);

        /*
        ERDEETI
        Arrays.sort(betNumbers);
        Arrays.sort(drawnNumbers);
        return Arrays.equals(betNumbers, drawnNumbers);

         */

            Arrays.sort(bet);
            Arrays.sort(drawn);
            return Arrays.equals(bet, drawn);
    }


    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return  Arrays.equals(day, anotherDay);
    }


    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int outer = 0; outer < size; outer++) {
            for (int inner = 0; inner < size; inner++) {
                multiplicationTable[outer][inner] = (outer + 1) * (inner + 1);
            }
        }

        return Arrays.deepToString(multiplicationTable);
    }


    public List<String> daysOfWeek() {
        String[] dayNames = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        return Arrays.asList(dayNames);
    }


    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }
}

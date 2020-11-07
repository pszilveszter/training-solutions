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
        int whole = 20;
        double[] day1 = new double[24];
        double[] day2 = new double[24];
        double[] day3;
        for (int i = 0; i < day1.length; i++) {
            double decimal = i * 0.1;
            day1[i] = whole + decimal;
            if (i == 1) {
                day2[i] = whole + 2 * decimal;
            } else {
                day2[i] = whole + decimal;
            }
        }
        day3 = Arrays.copyOf(day1, 24);

        System.out.println(array.sameTempValues(day1, day2));
        System.out.println(array.sameTempValues(day1, day3));

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

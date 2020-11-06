package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain array = new ArraysMain();

        System.out.println("numberOfDaysAsString");
        System.out.println(array.numberOfDaysAsString());

        System.out.println("daysOfWeek");
        System.out.println(array.daysOfWeek());

        System.out.println("multiplicationTableAsString");
        System.out.println(array.multiplicationTableAsString(5));

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

package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
        ArrayOfArraysMain array = new ArrayOfArraysMain();

        System.out.println("multiplicationTable & printArrayofArrays");
        int[][] multiplicationResult = array.multiplicationTable(4);
        array.printArrayofArrays(multiplicationResult);

        System.out.println("tringularMatrix");
        int[][] triangle = array.tringularMatrix(16);
        array.printArrayofArrays(triangle);

        System.out.println("getValues");
        array.printArrayofArrays(array.getValues());

    }


    public int[][] getValues() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] months = new int[12][];

        for (int m = 0; m < numberOfDays.length; m++) {
            months[m] = new int[numberOfDays[m]];
        }

        return months;
    }


    public int[][] tringularMatrix(int size) {
        int[][] triangle = new int[size][];

        for (int i = 0; i < size; i++) {
            triangle[i] = new int[i + 1];

            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = i + 1;
            }
        }
        return triangle;
    }


    public int[][] multiplicationTable(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                table[i][j] = (i+1) * (j+1);
            }
        }
        return table;
    }


    public void printArrayofArrays(int[][] a) {
        for (int[] i: a) {
            for (int j: i) {
                System.out.print(arrangeDigit(j) + " ");
            }
            System.out.println();
        }
    }

    public String arrangeDigit(Integer a) { // Bónusz track
        String result;
        if (a > 99) {
            result = a.toString();
        } else {
            if (a > 9) {
                result = " " + a;
            } else {
                result = "  " + a;
            }
        }

        return result;
    }

}

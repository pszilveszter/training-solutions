package arrayofarrays;

public class ArrayOfArraysMain {
    public static void main(String[] args) {
        ArrayOfArraysMain array = new ArrayOfArraysMain();
        int[][] multiplicationResult = array.multiplicationTable(4);
        array.printArrayofArrays(multiplicationResult);
        int[][] triangle = array.tringularMatrix(16);
        array.printArrayofArrays(triangle);
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
            StringBuilder line = new StringBuilder();
            for (int j: i) {
                line.append(j + " ");
            }
            System.out.println(line);
        }
    }

}

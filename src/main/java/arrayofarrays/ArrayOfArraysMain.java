package arrayofarrays;

public class ArrayOfArraysMain {
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
    public static void main(String[] args) {
        ArrayOfArraysMain array = new ArrayOfArraysMain();
        int[][] multiplicationResult = array.multiplicationTable(4);
        array.printArrayofArrays(multiplicationResult);
    }
}

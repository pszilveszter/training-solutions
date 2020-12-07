package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Negative and zero values are unexpected!");
        }

        int i = 2;
        while (i < x / 2) {
            if (x % i == 0) {
                return false;
            }
            i++;
        }
        return x > 1;
    }
}

package week08d05;

public class MathAlgorithm {

    public int greatestCommonDivisor(int a, int b) {
        int o = b;
        while (a % o != 0 || b % o != 0) {
            o--;
        }
        return o;
    }
}

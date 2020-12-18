package week08d05;

public class MathAlgorithm {

    public int greatestCommonDivisor(int a, int b) {
        int x = a;
        int y = b;
        int o = y;
        while (x % o != 0 || y % o != 0) {
            o--;
        }
        return o;
    }
}

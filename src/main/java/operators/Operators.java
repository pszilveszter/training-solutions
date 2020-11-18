package operators;

public class Operators {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public int multiplyByPowerOfTwo(int base, int multiplierOf2Power) {
        return Integer.parseInt(Integer.toBinaryString(base << multiplierOf2Power),2);
    }
}

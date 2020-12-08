package recursion;

public class FactorialCalculator {

    public long getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        long turn = getFactorial(n - 1);
        return n * turn;
    }
}

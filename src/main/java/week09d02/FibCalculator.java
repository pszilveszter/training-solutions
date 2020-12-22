package week09d02;

//A week09d02 csomagban készíts egy osztályt FibCalculator néven.
// Ennek legyen egy metódusa long sumEvens(int bound) néven.
// Ennek a metódusnak a feladata az, hogy összeadja a páros fibonacci számokat addig,
// amig a következő fibonacci szám nem nagyobb, mint bound, majd visszadja a végredményt.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibCalculator {

    private List<Long> fib = new ArrayList<>();

    public FibCalculator() {
        fib.add(0L);
        fib.add(1L);
        fib.add(1L);
    }

    public long sumEvens(int bound) {
        long result = 0L;
        long next = 0L;
        while (next <= bound) {
            next = nextFibonacchi(fib.get(fib.size() - 1));
            fib.add(next);
            if (next % 2 == 0) {
                result += next;
            }
        }
        return result;
    }

    private long nextFibonacchi(long number){
        return number + fib.get(fib.size() - 2);
    }
}

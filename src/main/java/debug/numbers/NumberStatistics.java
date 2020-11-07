package debug.numbers;

import java.util.Arrays;
import java.util.List;

public class NumberStatistics {
    private List<Integer> numbers;

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static void main(String[] args) {
        int result = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3)).sumPositives(); //--> 24
        System.out.println(result);
        result = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3)).minDifferenceBetweenNeighbours(); //--> 1
        System.out.println(result);
        result = new NumberStatistics(Arrays.asList(-3, -4)).sumPositives(); //--> 0
        System.out.println(result);
        result = new NumberStatistics(Arrays.asList(1)).minDifferenceBetweenNeighbours(); //--> IllegalStateException
        if (result < 0) {
            System.out.println("IllegalStateException");
        } else {
            System.out.println(result);
        }
    }


    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        int minDifference;
        if (numbers.size() > 1) {
            minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
            for (int i = 1; i < numbers.size() - 1; i++) {
                int actDifference = numbers.get(i) - numbers.get(i + 1) >= 0 ? numbers.get(i) - numbers.get(i + 1) : numbers.get(i + 1) - numbers.get(i);
                if (actDifference < minDifference) {
                    minDifference = actDifference;
                }
            }
        } else {
            minDifference = -1;
        }
        return minDifference;
    }
}

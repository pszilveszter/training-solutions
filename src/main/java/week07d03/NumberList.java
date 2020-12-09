package week07d03;

import java.util.List;

public class NumberList {
    public boolean isIncreasing(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            int p = numbers.get(i - 1);
            if (numbers.get(i) < p) {
                return false;
            }
        }
        return true;
    }

    public boolean isIncreasing2(List<Integer> numbers) {
        boolean result = true;
        int i = 0;
        int p = Integer.MIN_VALUE;
        while (i < numbers.size() && result) {
            if (numbers.get(i) < p) {
                result = false;
            }
            p = numbers.get(i);
            i++;
        }
        return result;
    }

    public boolean isIncreasing3(List<Integer> numbers) {
        int p = Integer.MIN_VALUE;
        int i = 0;
        boolean result = true;
        while (i < numbers.size() && result) {
            switch (isIncreasing(numbers.get(i), p)) {
                case "TRUE":
                    break;
                case "FALSE":
                    result = false;
                default:
            }
            p = numbers.get(i);
            i++;
        }
        return result;
    }

    private String isIncreasing(int a, int p) {
        if (a < p) {
            return "FALSE";
        }
        return "TRUE";
    }
}

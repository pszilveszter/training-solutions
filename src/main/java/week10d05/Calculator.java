package week10d05;

import java.util.*;

public class Calculator {

    public int findMinSum(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

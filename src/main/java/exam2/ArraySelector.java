package exam2;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public String selectEvens(int[] ints) {

        String evens = "";

        if (ints.length > 0) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < ints.length; i = i + 2) {
                result.add(ints[i]);
            }
            evens = result.toString();
        }

        return evens;

    }
}

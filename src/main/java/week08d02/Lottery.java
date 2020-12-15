package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers(int interval, int type) {
        List<Integer> numbers = new ArrayList<>();
        Random rnd = new Random(100);
        while (numbers.size() < type) {
            int x = rnd.nextInt(interval) + 1;
            if (!numbers.contains(x)) {
                numbers.add(x);
            }

        }
        return numbers;
    }

}

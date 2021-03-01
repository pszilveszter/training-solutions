package collectionslist.collectionsarraylist;

import java.util.*;

public class Lottery {

    private final Random rnd = new Random();

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }

        List<Integer> numbers = generateNumbers(ballCount);
        List<Integer> mix = mixNumbers(numbers);
        return draw(mix, lotteryType);
    }


    // Írj egy osztályt, amely létrehozza a golyókat (List<Integer> értékek)
    private List<Integer> generateNumbers(int c) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < c + 1; i++) {
            numbers.add(i);
        }
        return numbers;
    }


    // összekeveri,
    private List<Integer> mixNumbers(List<Integer> n) {
        for (int i = 0; i < n.size(); i++) {
            n.set(i, n.set(rnd.nextInt(n.size()), n.get(i)));
        }
        return n;
    }


    // megcsinálja a "húzást"
    private List<Integer> draw(List<Integer> n, int lotteryType) {
        for (int i = n.size() - lotteryType; i > 0; i--) {
            n.remove(rnd.nextInt(n.size()));
        }
        Collections.sort(n);
        return n;
    }
}

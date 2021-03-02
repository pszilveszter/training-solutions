package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {


    public Set<Integer> drawNumbers(int numOfDraws, int max) {
        if (max <= numOfDraws) {
            throw new IllegalArgumentException(String.format("drawCount must be less then %d!", max));
        }
        Queue<Integer> numbers = transform(generateNumbers(max));
        return drawNumbers(numbers, numOfDraws);
    }


    private List<Integer> generateNumbers(int count) {
        List<Integer> numbers = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            numbers.add(i +1);
        }

        Collections.shuffle(numbers);
        return numbers;
    }


    private Queue<Integer> transform(List<Integer> numbers) {
        Queue<Integer> q = new LinkedList<>();
        Collections.addAll(q, numbers.toArray(new Integer[0]));
        return q;
    }


    private TreeSet<Integer> drawNumbers(Queue<Integer> numbers, int draws) {
        TreeSet<Integer> result = new TreeSet<>();
        for (int i = 0; i < draws; i++) {
            result.add(numbers.poll());
        }
        return result;
    }
}

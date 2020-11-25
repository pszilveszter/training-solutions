package week05de03;

import java.util.List;

public class ListCounter {
    public int countStringBeginsWithA(List<String> input) {
        int result = 0;
        for (String word : input) {
            Character letter = word.toLowerCase().charAt(0);
            if ("a".equals(letter.toString())) {
                result++;
            }
        }
        return  result;
    }
}

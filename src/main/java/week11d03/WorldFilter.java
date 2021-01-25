package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WorldFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("Missing input");
        }

        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.indexOf(c) != -1) {
                result.add(word);
            }
        }
        return result;
    }
}

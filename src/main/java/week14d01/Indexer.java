package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> m = new HashMap<>();
        for (String name: names) {
            char key = name.charAt(0);
            if (!m.containsKey(key)) {
                m.put(key, new ArrayList<>());
            }
            m.get(key).add(name);
        }
        return m;
    }
}

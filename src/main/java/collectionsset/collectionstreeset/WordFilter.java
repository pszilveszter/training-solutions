package collectionsset.collectionstreeset;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordFilter {


    public Set<String> filterWords(String[] randomStrings) {
        TreeSet<String> orderedStrings = new TreeSet<>();
        Collections.addAll(orderedStrings, randomStrings);
        return orderedStrings;
    }
}

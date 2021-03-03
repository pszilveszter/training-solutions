package week13d05;

import java.util.HashSet;
import java.util.Set;

public class Letters {


    public int countIdenticalLetters(String s) {
        if (s == null) {return 0;}

        Set<Character> cs = new HashSet<>();
        for (char c: s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                cs.add(c);
            }
        }
        return cs.size();
    }
}

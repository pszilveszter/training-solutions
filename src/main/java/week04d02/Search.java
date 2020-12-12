package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<Integer> i = getIndexesOfChar("alma", 'a');
        System.out.println(i);
        }

        public static List<Integer> getIndexesOfChar(String str, char c) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                char current = str.charAt(i);
                if (c == current) {
                    result.add(i);
                }
            }
            return result;
        }
    }

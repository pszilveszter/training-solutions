package week04;

import java.util.ArrayList;
import java.util.List;

public class GetIndexesOfChar {
    public static void main(String[] args) {
        List<Integer> i = getIndexesOfChar("alma", 'a');
        for (int n : i) {
            System.out.println(n);
        }

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

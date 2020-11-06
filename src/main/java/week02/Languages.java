package week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();

        listA.add("Java");
        listA.add("Pyton");
        listA.add("JavaScript");

        for (String item: listA) {
            if (item.length() > 5) System.out.println(item);
        }
    }
}

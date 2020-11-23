package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {


    public List<Integer> find(List<Integer> numbers) {


        List<Integer> duplications = new ArrayList<>();

        for (int indexUp = 1; indexUp < numbers.size(); indexUp++) {
            for (int indexDown = 0; indexDown < indexUp; indexDown++) {
                if (numbers.get(indexUp).equals(numbers.get(indexDown))) {
                    duplications.add(numbers.get(indexUp));
                    break;
                }
            }
        }

        return duplications;
    }
}

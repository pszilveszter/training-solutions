package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int... numbers) {
        //System.out.println(numbers); valami ilyesmi: [I@17211155 - azért mert a tömbnek nincs iterátora, csak index alapján bejárható
        List<Integer> l = new ArrayList<>();
        for (int n: numbers) {
            l.add(n);
            //System.out.println(l.toString()); [2, 4, 6] - Mert a listának van iterátora, így minden Integer elemén meghívja az Integer-ben felüldefiniált toString() metódust
        }
        return l;
    }


    public int sumIntegerList(List<Integer> integerList) {
        // System.out.println(integerList.toString()); [2, 4, 6] - Mert a listának van iterátora, így minden Integer elemén meghívja az Integer-ben felüldefiniált toString() metódust
        int sum = 0;
        for (int n: integerList) {
            sum += n;
        }
        return sum;
    }


    public int sumIntegerObjects(Integer... integers) {
        //System.out.println(integers.toString()); valami ilyesmi: [Ljava.lang.Integer;@6fb0d3ed - azért mert a tömbnek nincs iterátora, csak index alapján bejárható
        int sum = 0;
        for (int n: integers) {
            sum += n;
        }
        return sum;
    }
}

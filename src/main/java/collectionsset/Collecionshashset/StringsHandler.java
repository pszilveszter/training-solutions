package collectionsset.Collecionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection) {
        return new HashSet<>(stringCollection);
    }


    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        Set<String> r = new HashSet<>();
        for (String a: setA) {
            if (setB.contains(a)) {
                r.add(a);
            }
        }
        return r;
    }
}

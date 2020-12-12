package methodoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {

    private List<Pub> pubs;

    public ListOfGoodPubs(List<Pub> pubs) {
        if (pubs == null || pubs.isEmpty()) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.pubs = pubs;
    }

    public Pub findTheBest() {
        Pub best = null;
        for (Pub p: pubs) {
            if (best == null || p.getOpenFrom().isEarlier(best.getOpenFrom())) {
                best = p;
            }
        }
        return best;
    }
}

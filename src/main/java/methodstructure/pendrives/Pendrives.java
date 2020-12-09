package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> ps) {
        Pendrive mostValuedPenddrive = null;
        for (Pendrive p: ps) {
            if (mostValuedPenddrive == null || p.comparePricePerCapacity(mostValuedPenddrive) == -1) {
                mostValuedPenddrive = p;
            }
        }
        return mostValuedPenddrive;
    }


    public Pendrive cheapest(List<Pendrive> ps) {
        Pendrive mostCheapPendrive = null;
        for (Pendrive p: ps) {
            if (mostCheapPendrive == null || p.cheaperThan(mostCheapPendrive)) {
                mostCheapPendrive = p;
            }
        }
        return mostCheapPendrive;
    }


    public void risePriceWhereCapacity(List<Pendrive> ps, int percent, int capacity) {
        for (Pendrive p: ps) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }
}

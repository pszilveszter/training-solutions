package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satelites = new ArrayList<>();


    public void registerSatellite(Satellite satellite) {
        if (isEmpty(satellite)) {
            throw new NullPointerException("Parameter must not be null!");
        }
        satelites.add(satellite);
    }


    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite s: satelites) {
            if (registerIdent.equals(s.getRegisterIdent())) {
                return s;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }


    private boolean isEmpty(Satellite sat) {
        return sat == null || sat.getRegisterIdent().isBlank();
    }


    @Override
    public String toString() {
        return satelites.toString();
    }
}

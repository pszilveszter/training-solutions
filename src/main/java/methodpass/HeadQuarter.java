package methodpass;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();


    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Missing trooper");
        }
        troopers.add(trooper);
    }


    public void moveTrooperByName(String name, Position target) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Missing trooper");
        }
        try {
            Trooper trooper = findTrooperByName(name);
            moveTrooper(trooper, target);
        }
        catch (NullPointerException npe) {
            throw new IllegalArgumentException("Missing target");
        }

    }


    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Missing target");
        }
        Trooper trooper = findClosestTrooper(target);
        moveTrooper(trooper, target);
    }


    private Trooper findTrooperByName(String name) {
        for (Trooper t: troopers) {
            if (name.equals(t.getName())) {
                return t;
            }
        }
        return null;
    }


    private Trooper findClosestTrooper(Position target) {
        int t = 0;
        double trooperDistance = troopers.get(t).distanceFrom(target);
        for (int i = 0; i < troopers.size(); i++) {
            if (trooperDistance > troopers.get(i).distanceFrom(target)) {
                t = i;
                trooperDistance = troopers.get(t).distanceFrom(target);
            }
        }
        return troopers.get(t);
    }


    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    public List<Trooper> getTroopers() {
        return List.copyOf(troopers);
    }

}

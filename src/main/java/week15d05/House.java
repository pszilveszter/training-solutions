package week15d05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House {

    private String name;
    private List<Battle> battles = new ArrayList<>();

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Battle> getBattles() {
        return new ArrayList<>(battles);
    }

    public void addBattle(Battle battle) {
        battles.add(battle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(getName(), house.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }


}

package week15d05;

import java.util.*;

public class Battle {

    private String name;
    private String number;
    private List<House> attackers = new ArrayList<>();
    private List<House> defenders = new ArrayList<>();
    private Winner winner;

    public Battle(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Battle(String name, String number, Winner winner) {
        this(name, number);
        this.winner = winner;
    }

    public void addAttackers(List<House> houses) {
        attackers = houses;
    }

    public void addDefenders(List<House> houses) {
        defenders = houses;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public List<House> getHouses() {
        List<House> houses = new ArrayList<>(attackers);
        houses.addAll(defenders);
        return houses;
    }

    public List<House> getAttackers() {
        return new ArrayList<>(attackers);
    }

    public List<House> getDefenders() {
        return new ArrayList<>(defenders);
    }

    public Winner getWinner() {
        return winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battle battle = (Battle) o;
        return Objects.equals(getName(), battle.getName()) && Objects.equals(getNumber(), battle.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }
}

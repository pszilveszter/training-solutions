package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public static void main(String[] args) {

        List<Position> postitions = new ArrayList<>();
        postitions.add(new Position("Főnök",1_000_000));
        postitions.add(new Position("Vezető", 500_000));
        postitions.add(new Position("Beosztott",100_000));

        for (Position p : postitions) {
            if (p.getBonus() > 150_000) {
                System.out.println(p.toString());
            }
        }
    }

    @Override
    public String toString() {
        return name + " " + bonus;
    }
}

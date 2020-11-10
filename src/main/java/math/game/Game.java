package math.game;

public class Game {
    public static void main(String[] args) {
        Point p1 = new Point(1, -1);
        Point p2 = new Point(-6, 8);

        Warrior warrior1 = new Warrior("Dávid", p1);
        Warrior warrior2 = new Warrior("Góliát", p2);

        for (int i = 1; (warrior1.isAlive() && warrior2.isAlive()); i++) {

            if (warrior1.distance(warrior2) == 0) {
                warrior1.attack(warrior2);
                if (warrior2.isAlive()) {
                    warrior2.attack(warrior1);
                }
            } else {
                warrior1.move(warrior2);
                if (warrior2.distance(warrior1) == 0) {
                    warrior2.attack(warrior1);
                } else {
                    warrior2.move(warrior1);
                }
            }

            System.out.println(i + ". forduló");
            System.out.println(warrior1.toString());
            System.out.println(warrior2.toString());
        }

        System.out.print("A gőztes ");
        if (warrior1.isAlive()) {
            System.out.println(warrior1.toString());
        } else {
            System.out.println(warrior2.toString());
        }

    }
}
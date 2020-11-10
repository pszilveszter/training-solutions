package math.game;

import java.util.Random;

public class Warrior {
    private String name;
    private int stamina;
    private double skill;
    private Point position;


    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = new Random().nextInt(80) + 20;
        skill = new Random().nextDouble();
    }


    public Point getPosition() {
        return position;
    }


    public void move(Warrior warrior) {
        int coordinateX = position.getX();
        int coordinateY = position.getY();
        int enemyCoordinateX = warrior.getPosition().getX();
        int enemyCoordinateY = warrior.getPosition().getY();

        if (coordinateX != enemyCoordinateX) {
            if (coordinateX < enemyCoordinateX) {
                coordinateX++;
            } else {
                coordinateX--;
            }
        }

        if (coordinateY != enemyCoordinateY) {
            if (coordinateY < enemyCoordinateY) {
                coordinateY++;
            } else {
                coordinateY--;
            }
        }
        position = new Point(coordinateX,coordinateY);
    }


    public double distance(Warrior enemy) {
        return position.distance(enemy.position);
    }


    public void attack(Warrior enemy) {
        if (new Random().nextDouble() < enemy.skill && isAlive()) {
            enemy.stamina = enemy.stamina - (new Random().nextInt(3) + 1);
        }
    }


    public boolean isAlive() {
        return stamina > 0;
    }


    public String toString() {
        return name + ": (" + getPosition().getX() + "," + position.getY() + ") " + stamina;
    }
}

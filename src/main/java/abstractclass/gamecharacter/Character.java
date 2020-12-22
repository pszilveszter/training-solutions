package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private final Point position;
    private int hitPoint;
    private Random random;

    protected Character(Point position) {
        this.position = position;
        this.hitPoint = 100;
    }

    protected Character(Point position, Random random) {
        this.position = position;
        this.hitPoint = 100;
        this.random = random;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public Point getPosition() {
        return position;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    public abstract void secondaryAttack(Character enemy);

    protected int getActualPrimaryDamage() {
        return random.nextInt(10) + 1;
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    private int getActualDefence() {
        return random.nextInt(6);
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }
}

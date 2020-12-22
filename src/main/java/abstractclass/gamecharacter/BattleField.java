package abstractclass.gamecharacter;

public class BattleField {

    private int round = 0;

    public int getRound() {
        return round;
    }

    public Character fight(Character one, Character other) {
        boolean oneIsLive = true;
        boolean otherIsLive = true;
        while (oneIsLive && otherIsLive) {
            round++;
            otherIsLive = oneHit(one, other);
            oneIsLive = oneHit(other, one);
        }
        return oneIsLive ? one : other;
    }

    private boolean oneHit(Character attacker, Character defender) {
        if (!attacker.isAlive() || !defender.isAlive()) {
            return false;
        }
        attacker.primaryAttack(defender);
        attacker.secondaryAttack(defender);
        return attacker.isAlive() && defender.isAlive();
    }
}

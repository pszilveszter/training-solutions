package statemachine.elevator;

public enum Positions {
    GROUND_OPEN ("Ground Floor Open", 0),
    GROUND_CLOSED ("Ground Floor Closed", 0),
    FIRST_CLOSED ("First Floor Closed", 1),
    FIRST_OPEN ("First Floor Open", 1);

    private final String position;
    private final int level;

    Positions(String position, int level) {
        this.position = position;
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public int getLevel() {
        return level;
    }
}

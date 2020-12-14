package methodpass;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        position = new Position(0, 0);
    }


    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Missing target definition");
        }
        position = target;
    }

    public double distanceFrom(Position targetPosition) {
        if (targetPosition == null) {
            throw new IllegalArgumentException("Missing target definition");
        }
        return position.distanceFrom(targetPosition);
    }


    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}

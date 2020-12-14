package methodpass;

public class Position {
    private final double posX;
    private final double posY;

    public Position(double x, double y) {
        posX = x;
        posY = y;
    }


    public double distanceFrom(Position targetPosition) {
        if (targetPosition == null) {
            throw new IllegalArgumentException("Missing target!");
        }
        return Math.sqrt(Math.pow(posX - targetPosition.getPosX(),2)  + Math.pow(posY - targetPosition.getPosY(),2));
    }


    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}

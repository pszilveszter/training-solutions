package math.game;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point other) {
        int wholePart = Math.abs(getX() - other.getX());
        int decimalPart = Math.abs(getY() - other.getY());
        return wholePart + (double) decimalPart / 10;
    }
}

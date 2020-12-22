package abstractclass.gamecharacter;

public class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point p) {
        return Math.round(Math.sqrt((Math.pow((double) x - p.getX(),2)) + Math.pow((double) y - p.getY(),2)));
    }
}

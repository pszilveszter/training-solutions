package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    public static final long ALTITUDE = 5;

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

    public void flyTo(Point position) {
        this.position = position;
        path.add(position);
    }

    @Override
    public void liftTo(long altitude) {
        Point p = new Point(position.getX(), position.getY(), altitude);
        position = p;
        path.add(p);
    }

    // delegálja a funkciót
    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    //komplex mozgás, felemelkedik, elrepül a célpont fölé, és leereszkedik
    @Override
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        flyTo(new Point(position.getX(), position.getY(), getAltitude()));
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle += angle;
    }

    @Override
    public List<Point> getPath() {
        return List.copyOf(path);
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }
}

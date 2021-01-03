package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MoveableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
    }

    @Override
    public void moveTo(Point position) {
        goTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        goTo(position);
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

    private void goTo(Point position) {
        this.position = position;
        path.add(position);
    }
}

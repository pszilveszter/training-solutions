package statemachine.elevator;

public class GroundFloorClosed implements ElevatorState {

    @Override
    public int getLevel() {
        return Positions.GROUND_CLOSED.getLevel();
    }

    @Override
    public String getState() {
        return Positions.GROUND_CLOSED.getPosition();
    }

    @Override
    public ElevatorState nextState(int level) {
        if (getLevel() == level) {
            return new FirstFloorClosed();
        }
        return new GroundFloorOpen();
    }
}

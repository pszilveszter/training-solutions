package statemachine.elevator;

public class FirstFloorClosed implements ElevatorState {

    @Override
    public int getLevel() {
        return Positions.FIRST_CLOSED.getLevel();
    }

    @Override
    public String getState() {
        return Positions.FIRST_CLOSED.getPosition();
    }

    @Override
    public ElevatorState nextState(int level) {
        if (getLevel() == level) {
            return new GroundFloorClosed();
        }
        return new FirstFloorOpen();
    }
}

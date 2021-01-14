package statemachine.elevator;

public class FirstFloorOpen implements ElevatorState {

    @Override
    public int getLevel() {
        return Positions.FIRST_CLOSED.getLevel();
    }

    @Override
    public String getState() {
        return Positions.FIRST_OPEN.getPosition();
    }

    @Override
    public ElevatorState nextState(int level) {
        return new FirstFloorClosed();
    }
}

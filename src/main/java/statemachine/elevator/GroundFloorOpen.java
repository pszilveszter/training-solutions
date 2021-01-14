package statemachine.elevator;

public class GroundFloorOpen implements ElevatorState {

    @Override
    public int getLevel() {
        return Positions.GROUND_OPEN.getLevel();
    }

    @Override
    public String getState() {
        return Positions.GROUND_OPEN.getPosition();
    }

    @Override
    public ElevatorState nextState(int level) {
        return new GroundFloorClosed();
    }
}

package statemachine.elevator;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private List<String> history = new ArrayList<>();
    private List<String> target = new ArrayList<>();
    private ElevatorState currentState;
    private int level;

    public Elevator() {
        this(new GroundFloorOpen());
    }

    public Elevator(ElevatorState elevatorState) {
        currentState = elevatorState;
        history.add(currentState.getState());
    }


    public String getHistory() {
        return history.toString();
    }


    public void work() {
        for (String expectedState: target) {
            while (!expectedState.equals(currentState.getState())) {
                currentState = currentState.nextState(level);
                history.add(currentState.getState());
            }
            level = currentState.getLevel();
        }
        target.clear();
    }

    public void pushButtonToGoToFirstFloor() {
        target.add(Positions.FIRST_OPEN.getPosition());
    }

    public void pushButtonToGoToGroundFloor() {
        target.add(Positions.GROUND_OPEN.getPosition());
    }

    public void pushCallButtonOnGroundFloor() {
        pushButtonToGoToGroundFloor();
    }

    public void pushCallButtonOnFirstFloor() {
        pushButtonToGoToFirstFloor();
    }

}
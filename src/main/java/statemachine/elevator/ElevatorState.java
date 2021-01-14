package statemachine.elevator;

public interface ElevatorState {

    int getLevel();

    String getState();

    ElevatorState nextState(int level);
}

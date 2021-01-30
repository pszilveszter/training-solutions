package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public void readStatesFromFile(String fileName) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {
            String data;
            while ((data = reader.readLine()) != null) {
                states.add(new State(data.split("-")[0], data.split("-")[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!");
        }

    }

    public String findCapitalByStateName(String stateName) {
        for (State state : states) {
            if (stateName.equals(state.getStateName())) {
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }
}

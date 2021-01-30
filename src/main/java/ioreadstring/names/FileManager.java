package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private Path path;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String path) {
        this.path = Path.of(path);
    }

    public Path getMyFile() {
        return path;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void readFromFile() {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                readHuman(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cold not read file", e);
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Bad data", iae);
        }
    }

    private void readHuman(String line) {
        try {
            humans.add(new Human(line.split(" ")[0], line.split(" ")[1]));
        } catch (ArrayIndexOutOfBoundsException iob) {
            throw new IllegalArgumentException("Could not parse line: " + line);
        }
    }

}

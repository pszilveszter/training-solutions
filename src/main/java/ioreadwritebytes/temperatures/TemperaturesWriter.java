package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {

    public void writeTemperatures(Temperatures temperatures, String pathString) {
        if (temperatures == null) {
            throw new IllegalStateException("No Temeprature record to write");
        }
        try {
            Files.write(Path.of(pathString), temperatures.getData());
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file");
        }
    }
}

package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathString) {
        try {
            return new Temperatures(Files.readAllBytes(Path.of(pathString)));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Unable to read file: " + pathString, ioe);
        }
    }
}

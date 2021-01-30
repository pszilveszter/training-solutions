package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NameWriter {

    private Path file;
    private List<String> names = new ArrayList<>();

    public NameWriter(Path file) {
        this.file = file;
    }

    public void addAndWrite(String name) {
        names.add(name); // "neveket fogunk eltárolni fájlban és listában egyaránt" ??? nincs rá szükség csak akkor ha az APPEND enumot elhagyjuk
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND)) {
            writer.write(name);
            writer.newLine();
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Unable to write file");
        }
    }
}

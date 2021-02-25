package iofilestest.cheesemanager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheeseManager {

    public void saveToFile(Path path, List<Cheese> cheeses) {
        try (DataOutputStream stream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Cheese c: cheeses) {
                stream.writeUTF(c.getName());
                stream.writeDouble(c.getLactose());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file " + path, ioe);
        }
    }

    public Cheese findCheese(Path path, String name) {
        try (DataInputStream stream = new DataInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
            while (stream.available() > 0) {
                String n = stream.readUTF();
                double l = stream.readDouble();
                if (name.equals(n)) {
                    return new Cheese(n, l);
                }
            }
            return null;
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file " + path, ioe);
        }
    }
}

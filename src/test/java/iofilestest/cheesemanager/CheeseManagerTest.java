package iofilestest.cheesemanager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheeseManagerTest {

    Cheese c1 = new Cheese("Ementali", 1.4);
    Cheese c2 = new Cheese("Parenyica", 3.6);
    Cheese c3 = new Cheese("Pannonia", 1.2);

    @TempDir
    public File folder;


    @Test
    void testSavetoFile() throws IOException {
        Path file = new File(folder, "cheeses.dat").toPath();

        new CheeseManager().saveToFile(file, List.of(c1,c2,c3));
        List<Cheese> testData = new ArrayList<>();
        DataInputStream stream = new DataInputStream(new BufferedInputStream(Files.newInputStream(file)));
        while (stream.available() > 0) {
            testData.add(new Cheese(stream.readUTF(), stream.readDouble()));
        }

        assertEquals(3, testData.size());
        assertEquals(c1.getName(), testData.get(0).getName());

    }

    @Test
    void testFindCheese() {
        Path file = new File(folder, "cheeses.dat").toPath();
        new CheeseManager().saveToFile(file, List.of(c1,c2,c3));

        Cheese found = new CheeseManager().findCheese(file, "Parenyica");
        assertEquals(c2.getName(), found.getName());
    }

    @Test
    void testNotFindCheese() {
        Path file = new File(folder, "cheeses.dat").toPath();
        new CheeseManager().saveToFile(file, List.of(c1,c2,c3));

        Cheese found = new CheeseManager().findCheese(file, "Medve");
        assertNull(found);
    }
}
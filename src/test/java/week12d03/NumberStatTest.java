package week12d03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    @TempDir
    public File folder;


    @Test
    public void testLowestUniqueNumberFromFile() throws IOException {
        Path file = new File(folder, "test.txt").toPath();
        Files.writeString(file, "1,1,4\n2,3,5\n2,2,5");

        NumberStat ns = new NumberStat();
        ns.loadFromFile(file);
        assertEquals(3, ns.lowestUniqueNumber());
    }

    @Test
    public void testNullLowestUniqueNumberFromFile() throws IOException {
        Path file = new File(folder, "test.txt").toPath();
        Files.writeString(file, "1,1");

        NumberStat ns = new NumberStat();
        ns.loadFromFile(file);
        Exception ex = assertThrows(IllegalStateException.class, ()-> ns.lowestUniqueNumber());
        assertEquals("No unique integer", ex.getMessage());
    }

    @Test
    public void testNoFile() {
        Path path = folder.toPath();
        Exception ex = assertThrows(IllegalStateException.class, ()-> new NumberStat().loadFromFile(path));
        assertEquals("Unable to read file " + path, ex.getMessage());

    }


}
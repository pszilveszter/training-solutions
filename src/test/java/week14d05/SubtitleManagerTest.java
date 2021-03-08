package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SubtitleManagerTest {

    @Test
    void testCountWords() {
        Path file = Path.of("hachiko.srt");

        assertEquals(4, new SubtitleManager().countWords(file, "Hachiko", "haza", "pályaudvar", "jó").get("Hachiko"));
    }
}
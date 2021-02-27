package week11d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilesSumTest {

    @Test
    void testSumNumbers() {
        FilesSum fs = new FilesSum();
        assertEquals(202, fs.sumNumbers());
    }
}
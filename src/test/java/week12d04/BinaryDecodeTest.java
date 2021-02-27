package week12d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryDecodeTest {

    @Test
    public void testDecode() {
        String secret = new BinaryDecode().decode();
        assertEquals("       _\n" +
                "      | |\n" +
                "      | | __ ___   ____ _\n" +
                "  _   | |/ _` \\ \\ / / _` |\n" +
                " | |__| | (_| |\\ V / (_| |\n" +
                "  \\____/ \\__,_| \\_/ \\__,_|\n",secret);
    }

}
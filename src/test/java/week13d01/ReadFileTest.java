package week13d01;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    public void testLongestCity() {
        InputStream stream = this.getClass().getResourceAsStream("/iranyitoszamok-varosok-2021.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        assertEquals("Jászfelsőszentgyörgy", new ReadFile().longestCity(br));
    }

}
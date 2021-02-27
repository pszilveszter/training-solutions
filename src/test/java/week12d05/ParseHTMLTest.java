package week12d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class ParseHTMLTest {

    @Test
    public void testCountExpressionFromFile() {

        // Given
        ParseHTML html = new ParseHTML();
        InputStream is = this.getClass().getResourceAsStream("index.html");

        // When
        int result = html.countExpressionFromFile("koronavírus", new BufferedReader(new InputStreamReader(is)));

        // Then
        assertEquals(16,result);
    }

}
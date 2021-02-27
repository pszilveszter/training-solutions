package week12d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseHTMLTest {

    @Test
    public void testCountExpressionFromFile() {
        ParseHTML html = new ParseHTML();
        int result = html.countExpressionFromFile("koronavírus");
        assertEquals(16,result);
    }

}
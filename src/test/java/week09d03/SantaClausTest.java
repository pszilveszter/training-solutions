package week09d03;

import org.junit.jupiter.api.Test;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {

    @Test
    void testAged14up() {
        List<Person> p = Arrays.asList(new Person("Fiatal", 13),new Person("Felnőtt", 18));
        SantaClaus sc = new SantaClaus(p);
        sc.getThroughChimneys();
        int countPresent = 0;
        for (Person person : p) {
            if (person.getPresent() != null) {
                countPresent++;
            }
        }
        assertEquals(1, countPresent);
    }

}
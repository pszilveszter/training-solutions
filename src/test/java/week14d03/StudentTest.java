package week14d03;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s = new Student("Remek Elek");

    @Test
    void testAddGrades() {
        String expected = "[5, 4, 5]";

        s.addGrade("Fizika", 5);
        s.addGrade("Fizika", 4);
        s.addGrade("Fizika", 5);
        s.addGrade("Ének", 3);

        Map<String, List<Integer>> result = s.getRates();
        assertTrue(result.containsKey("Ének"));
        assertEquals(expected, result.get("Fizika").toString());
    }

}
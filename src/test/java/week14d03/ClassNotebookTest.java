package week14d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    Student s1 = new Student("Mézga Géza");
    Student s2 = new Student("Okos Ákos");
    Student s3 = new Student("Csini Marcsi");

    ClassNotebook cn = new ClassNotebook(List.of(s1, s2, s3));

    @Test
    void testSortedNotebook() {
        List<Student> expected = List.of(s3, s1, s2);
        List<Student> result = cn.sortNotebook();
        assertEquals(expected, result);
    }

    @Test
    void testAddGrades() {
        String expected = "{Bolondéria=[4]}";

        s1.addGrade("Bolondéria", 4);
        assertEquals("Mézga Géza", cn.sortNotebook().get(1).getName());
        assertEquals(expected, cn.sortNotebook().get(1).getRates().toString());
    }

    @Test
    void testAddGradeFailure() {
        cn.sortNotebook().get(1).addGrade("ABC", 1);
        assertTrue(cn.sortNotebook().get(1).getRates().isEmpty());
    }

}
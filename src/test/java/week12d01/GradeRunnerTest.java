package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeRunnerTest {

    @Test
    void getGrades() {
        int[] grades = {99, 54, 51, 40, 39};
        assertEquals(100, GradeRunner.roundGrades(grades)[0]);
        assertEquals(55, GradeRunner.roundGrades(grades)[1]);
        assertEquals(51, GradeRunner.roundGrades(grades)[2]);
        assertEquals(40, GradeRunner.roundGrades(grades)[3]);
        assertEquals(39, GradeRunner.roundGrades(grades)[4]);
        assertEquals(5, GradeRunner.roundGrades(grades).length);
    }

}
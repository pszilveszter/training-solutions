package week15d02;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class QuestionnaireTest {

    // Given
    Questionnaire q = new Questionnaire(this.getClass().getResourceAsStream("kerdesek.txt"));


    @Test
    void readFile() {
        // When
        int pcs = q.getQuestions().size();

        // Then
        assertEquals(8, pcs);
    }


    @Test
    void testGetDataOfRandomQuestion() {
        // When
        Question result = q.getDataOfRandomQuestion(new Random(10L));

        // Then
        assertEquals("Melyik evben kezdodott a Honfoglalas?", result.getProblem());
        assertEquals("895", result.getAnswer());
        assertEquals("tortenelem", result.getSubject());
        assertEquals(1, result.getPoints());
    }


    @Test
    void testGetQuestionsOf() {
        // When
        List<String> result = q.getQuestionsOf("tortenelem");

        // Then
        assertEquals(5, result.size());
        assertEquals("Mikor volt a mohacsi vesz?", result.get(0));
        assertEquals("Melyik evben adtak ki Angliaban a Magna Chartat?", result.get(4));
    }


    @Test
    void testGetQuestionsOfNull() {
        // When
        String topic = "fizika";

        // Then
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> q.getQuestionsOf(topic));
        assertEquals("Topic: fizika is not found", ex.getMessage());
    }


    @Test
    void testGetAllQuestionBySubject() {
        // When
        Map<String, List<Question>> result = q.getAllQuestionBySubject();

        // Then
        assertEquals(2, result.size());
        assertTrue(result.containsKey("tortenelem"));
        assertEquals(5, result.get("tortenelem").size());
        Question q = result.get("matematika").get(2);
        assertEquals("Hany atloja van a szabalyos nyolcszognek?", q.getProblem());
        assertEquals(2, q.getPoints());
        assertEquals("24", q.getAnswer());
    }


    @Test
    void testGetHeaviestSubject() {
        // When
        String result = q.getHeaviestSubject();

        // Then
        assertEquals("tortenelem", result);
    }
}
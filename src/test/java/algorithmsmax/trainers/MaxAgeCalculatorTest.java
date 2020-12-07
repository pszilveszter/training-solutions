package algorithmsmax.trainers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testMayAgeCaluclator() {
        MaxAgeCalculator getMay = new MaxAgeCalculator();
        List<Trainer> trainers = List.of(
                new Trainer("Vicián István", 29),
                new Trainer("Barcay Kristóf", 28),
                new Trainer("Arnold Ádám", 27)
        );
        assertEquals("Vicián István, kor: 29", getMay.trainerWithMaxAge(trainers).toString());

    }

}
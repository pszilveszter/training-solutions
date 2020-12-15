package week08d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    List<Integer> i = Arrays.asList(26, 11, 65, 19,62);
    @Test
    void draw() {
        List<Integer> l = new Lottery().getNumbers(90,5);
        assertEquals(i, l);
    }

}
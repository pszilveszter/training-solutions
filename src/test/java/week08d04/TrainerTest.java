package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testGoodMood() {
        Trainer gt = new Trainer(new GoodMood());
        assertEquals(5, gt.giveMark());
    }

    @Test
    void testBadMood() {
        Trainer bt = new Trainer(new BadMood());
        assertEquals(3, bt.giveMark());
    }

}
package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void testOperation() {
        Operation op = new Operation("  161 + 18 ");
        assertEquals(179, op.getResult());
    }

}
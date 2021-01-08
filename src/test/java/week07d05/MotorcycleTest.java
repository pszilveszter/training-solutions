package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {


    @Test
    void testDefault() {
        Motorcycle m = new Motorcycle();
        assertEquals(5, m.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, m.getTransmissionType());
    }

    @Test
    void testGears() {
        Motorcycle m = new Motorcycle(4);
        assertEquals(4, m.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, m.getTransmissionType());
    }

}
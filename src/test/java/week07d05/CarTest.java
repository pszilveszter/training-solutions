package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testDefault() {
        Car c = new Car();
        assertEquals(5, c.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, c.getTransmissionType());
    }

    @Test
    void testGears() {
        Car c = new Car(4);
        assertEquals(4, c.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, c.getTransmissionType());
    }
}
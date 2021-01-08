package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {


    @Test
    void testDefault() {
        Truck t = new Truck();
        assertEquals(5, t.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, t.getTransmissionType());
    }

    @Test
    void testGears() {
        Truck t = new Truck(4);
        assertEquals(4, t.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, t.getTransmissionType());
    }

    @Test
    void testTransmissionType() {
        Truck t = new Truck(TransmissionType.SEQUENTIAL);
        assertEquals(5, t.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, t.getTransmissionType());
    }

    @Test
    void testGearAndTransmissionType() {
        Truck t = new Truck(4, TransmissionType.AUTOMATIC);
        assertEquals(4, t.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, t.getTransmissionType());
    }
}
//Készíts a week07d05 csomagba egy Vehicle, egy Car, egy Truck és egy Motorcycle osztályt.
// A Vehicle osztálynak legyen egy int getNumberOfGears és egy TransmissionType getTransmissionType metódusa.
// A fenti osztályok értelemszerűen öröklődjenek egymásból és mindegyiknek implementálja a sebességek számát és a váltó típusát.
// A lehetséges váltótípusok: MANUAL, AUTOMATIC, SEQUENTIAL.
// Az alapértelmezett(kizárólagos) váltó típus (a Vehicle osztályban) MANUAL, de
// a Car automatikus, míg a Motorcycle SEQUENTIAL. Az alapértelmezett sebesség szám 5.

package week07d05;

public abstract class Vechile {
    public static final int DEFAULT_GEARS = 5;
    public static final TransmissionType DEFAULT_TRANSMISSIONTYPE = TransmissionType.MANUAL;

    private int gears;
    private TransmissionType transmissionType;

    protected Vechile() {
        this.transmissionType = DEFAULT_TRANSMISSIONTYPE;
        gears = DEFAULT_GEARS;
    }

    protected Vechile(int gears) {
        this.transmissionType = DEFAULT_TRANSMISSIONTYPE;
        this.gears = gears;
    }

    public final int getNumberOfGears() {
        return gears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}

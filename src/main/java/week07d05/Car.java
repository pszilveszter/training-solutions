package week07d05;

public class Car extends Vechile {

    public Car() {
        super();
        super.transmissionType = TransmissionType.AUTOMATIC;
    }

    public Car(int gears) {
        super(gears);
        super.transmissionType = TransmissionType.AUTOMATIC;
    }
}

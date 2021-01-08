package week07d05;

public class Car extends Vechile {

    private TransmissionType transmissionType;

    public Car() {
        super();
        this.transmissionType = TransmissionType.AUTOMATIC;
    }

    public Car(int gears) {
        super(gears);
        this.transmissionType = TransmissionType.AUTOMATIC;
    }

    @Override
    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}

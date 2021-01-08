package week07d05;

public class Motorcycle extends Vechile  {

    private TransmissionType transmissionType;

    public Motorcycle() {
        super();
        transmissionType = TransmissionType.SEQUENTIAL;
    }

    public Motorcycle(int gears) {
        super(gears);
        transmissionType = TransmissionType.SEQUENTIAL;
    }

    @Override
    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

}

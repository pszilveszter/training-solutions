package week07d05;

public class Truck extends Vechile {

    private TransmissionType transmissionType;

    public Truck() {
        super();
        transmissionType = super.getTransmissionType();
    }

    public Truck(int gears) {
        super(gears);
        transmissionType = super.getTransmissionType();
    }

    public Truck(TransmissionType transmissionType) {
        super();
        this.transmissionType = transmissionType;
    }

    public Truck(int gears, TransmissionType transmissionType) {
        super(gears);
        this.transmissionType = transmissionType;
    }

    @Override
    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}

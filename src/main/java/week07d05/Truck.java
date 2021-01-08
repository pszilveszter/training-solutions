package week07d05;

public class Truck extends Vechile {

    public Truck() {
        super();
    }

    public Truck(int gears) {
        super(gears);
    }

    public Truck(TransmissionType transmissionType) {
        super();
        super.transmissionType = transmissionType;
    }

    public Truck(int gears, TransmissionType transmissionType) {
        super(gears);
        super.transmissionType = transmissionType;
    }

}

package week07d05;

public class Motorcycle extends Vechile  {

    public Motorcycle() {
        super();
        super.transmissionType = TransmissionType.SEQUENTIAL;
    }

    public Motorcycle(int gears) {
        super(gears);
        super.transmissionType = TransmissionType.SEQUENTIAL;
    }

}

package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(155.4,true);
        System.out.println("Távolság: " + distance.getDistanceInKm());
        System.out.println("Ppntos érték? " + distance.isExact());

        int wholeDistance = (int) distance.getDistanceInKm();
        System.out.println("Egész KM: " + wholeDistance);

    }
}

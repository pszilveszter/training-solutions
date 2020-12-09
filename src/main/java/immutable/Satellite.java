package immutable;

public class Satellite {

    private String registerIdent;
    private CelestialCoordinates destinationCoordinates;


    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.registerIdent = registerIdent;
        this.destinationCoordinates = destinationCoordinates;
    }


    public void modifyDestination(CelestialCoordinates diff) {
        int x = destinationCoordinates.getX() + diff.getX();
        int y = destinationCoordinates.getY() + diff.getY();
        int z = destinationCoordinates.getZ() + diff.getZ();
        destinationCoordinates = new CelestialCoordinates(x, y, z);
    }


    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }


    @Override
    public String toString() {
        return registerIdent + ": " + destinationCoordinates;
    }


    public String getRegisterIdent() {
        return registerIdent;
    }


    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }
}

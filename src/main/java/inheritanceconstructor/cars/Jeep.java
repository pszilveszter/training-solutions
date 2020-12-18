package inheritanceconstructor.cars;

public class Jeep extends Car {

    private final double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if (fuel > super.calculateRefillAmount() + calculateRefillAmount()) {
            throw new IllegalArgumentException("Tank capacity is exceeded");
        }
        double spaceInTank = super.calculateRefillAmount();
        super.modifyFuelAmount(spaceInTank);
        fuel -= spaceInTank;
        extraFuel += fuel;
    }

    @Override
    public void drive(int km) { // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
        double fuelNeed = super.getFuelRate() * km / 100;
        if (fuelNeed > super.getFuel() + extraFuel) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        if (fuelNeed > extraFuel) {
            fuelNeed -= extraFuel;
            extraFuel = 0;
            super.modifyFuelAmount(-fuelNeed);
        } else {
            extraFuel -= fuelNeed;
        }
    }

    @Override
    public double calculateRefillAmount() { //kiszámolja, mennyit lehet tankolni
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}

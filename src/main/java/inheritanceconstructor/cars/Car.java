package inheritanceconstructor.cars;

public class Car {

    private final double fuelRate;
    private double fuel;
    private final double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (tankCapacity < fuel) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public void modifyFuelAmount(double fuel) {
        if (fuel > calculateRefillAmount()) {
            throw new IllegalArgumentException("Tank capacity is exceeded");
        }
        this.fuel += fuel;
    }

    public void drive(int km) { // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
        double fuelNeed = fuelRate * km / 100;
        if (fuel + 0.1 < fuelNeed) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        fuel -= fuelNeed;
    }
    public double calculateRefillAmount() { //kiszámolja, mennyit lehet tankolni
        return tankCapacity - fuel;
    }
}

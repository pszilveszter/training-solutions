package iofilestest.cheesemanager;

public class Cheese {

    private final String name;
    private final double lactose;

    public Cheese(String name, double lactose) {
        this.name = name;
        this.lactose = lactose;
    }

    public String getName() {
        return name;
    }

    public double getLactose() {
        return lactose;
    }
}

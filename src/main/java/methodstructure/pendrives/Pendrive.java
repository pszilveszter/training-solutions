package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }


    public boolean cheaperThan(Pendrive pd) {
        return price < pd.getPrice();
    }


    public int comparePricePerCapacity(Pendrive pd) {
        double current = (double) price / capacity;
        double control = (double) pd.getPrice() / pd.getCapacity();
        if (current > control) {
            return 1;
        }
        if (control > current) {
            return -1;
        }
        return 0;
    }


    public void risePrice(int percent) {
        price += price * percent / 100;
    }


    @Override
    public String toString() {
        return String.format("%s - %d Gb - %d", name, capacity, price);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}

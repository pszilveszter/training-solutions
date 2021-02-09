package ioreaderclasspath;

public class Country {
    private final String name;
    private final int neighbor;

    public Country(String name, int neighbor) {
        this.name = name;
        this.neighbor = neighbor;
    }

    public String getName() {
        return name;
    }

    public int getBorderCountries() {
        return neighbor;
    }
}

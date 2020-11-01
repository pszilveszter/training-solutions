package classstructuremethods;

public class Client {
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private int year;
    private  String address;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public void migrate(String address) {
        setAddress(address);
    }
}

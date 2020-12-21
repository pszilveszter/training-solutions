package objectclass;

public class Beer {
    private String name;
    private int price;

    public Beer(String name, int price) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name of bear must be provided!");
        }
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Beer b = (Beer) obj;
        if (isEmpty(b.name) || !name.equals(b.name) || price != b.price) {
            return false;
        }
        return true;
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}

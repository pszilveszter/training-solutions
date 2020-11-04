package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {
        return name.equals(p.name) && (code.length() - p.code.length() < 2 && code.length() - p.code.length() > -2);
    }

    public static void main(String[] args) {
        Product p1 = new Product("név","code");
        Product p2 = new Product("név","code1");
        Product p3 = new Product("név3","code123");

        System.out.println(p1.areTheyEqual(p2));
        System.out.println(p1.areTheyEqual(p3));

        // kódok különbsége???? MA nem tudok beszélni, de ezt a részt nem értem
    }
}

package finalmodifier;

public class TaxCalculator {

    public static final double TAX_RATE = 0.27;


    public static void main(String[] args) {
        System.out.println("99.9 értékű termék áfá értéke = " + new TaxCalculator().tax(99.9));
        System.out.println("99.9 értékű termék ára áfá-val = " + new TaxCalculator().priceWithTax(99.9));
    }


    public double tax(double price) {
        return price * TAX_RATE;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }
}

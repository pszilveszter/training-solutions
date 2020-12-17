package introinheritance.basket;

public class Item {

    private String barcode;
    private double nettoPrice;
    private int vatPercent;


    public Item(String barcode, double nettoPrice, int vatPercent) {
        if (isEmpty(barcode)) {
            throw new IllegalArgumentException("Barcode is missing");
        }
        if (nettoPrice < 1) {
            throw new IllegalArgumentException("Unexpected input of price: " + nettoPrice);
        }
        if (vatPercent < 0) {
            throw new IllegalArgumentException("Unexpected input of vat: " + vatPercent);
        }
        this.barcode = barcode;
        this.nettoPrice = nettoPrice;
        this.vatPercent = vatPercent;
    }

    // a nettoPrice és a vatPercent alapján kiszámolja az adó összegét
    public double getTaxAmount() {
        return nettoPrice * vatPercent / 100;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    // generált string reprezentáció
    @Override
    public String toString() {
        return "Item{" +
                "barcode='" + barcode + '\'' +
                ", nettoPrice=" + nettoPrice +
                ", vatPercent=" + vatPercent +
                '}';
    }

    private boolean isEmpty(String s) {
        return s == null || s.isBlank();
    }
}
